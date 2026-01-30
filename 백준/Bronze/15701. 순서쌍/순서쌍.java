import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());

        long n = N;
        long answer = 1;

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                int cnt = 0;
                while (n % i == 0) {
                    n /= i;
                    cnt++;
                }
                answer *= (cnt + 1);
            }
        }

        // 소인수가 하나 남아있는 경우
        if (n > 1) {
            answer *= 2;
        }

        System.out.println(answer);
    }
}