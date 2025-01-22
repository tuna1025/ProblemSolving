import java.io.*;
import java.util.*;


class Main {
        public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            stack.clear(); // 스택 초기화
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stack.push(s.charAt(j));
                }
                else if (s.charAt(j) == ')') {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    else stack.pop();
                }
            }
            if (stack.isEmpty() && flag) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        br.close();
        }
}