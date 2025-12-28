import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            if (i % 6 == 0) {
                System.out.print("Go! ");
            }
        }

        // 마지막이 6의 배수가 아닐 경우에도 Go! 출력
        if (N % 6 != 0) {
            System.out.print("Go!");
        }
    }
}
