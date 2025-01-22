import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        int j = 1;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            while (j <= a) {
                stack.push(j);
                result.append("+\n");
                j++;
            } // 입력값에 도달할 때까지 push

            if (stack.peek() == a) {
                stack.pop();
                result.append("-\n");
            } // 해당 값에 도달하면 pop
            else {
                bw.write("NO\n");
                bw.flush();
                br.close();
                bw.close();
                return; // 프로그램 종료
            }
        }

        bw.write(result.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
