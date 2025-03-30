import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String exp = br.readLine();
        int expLength = exp.length();
        Stack<Character> stack = new Stack<>();
        int cnt;

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            cnt = 0;
            if (stack.size() >= expLength) { //폭발문자열 길이 이상이면 탐색시작
                for (int j = 0; j < expLength; j++) {
                    if (stack.get(stack.size() - expLength + j) == exp.charAt(j)) {
                        cnt++;
                    }// 스택에서 exp의 길이 만큼 검사해서 문자가 같으면 cnt++
                    // cnt가 exp의 길이랑 같으면 터트림
                }
                if (cnt == expLength) {
                    for (int j = 0; j < expLength; j++) {
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack) {
            sb.append(c);
        }
        System.out.println(sb.length() == 0 ? "FRULA" : sb.toString()); //비어있음 frula 출력
    }
}