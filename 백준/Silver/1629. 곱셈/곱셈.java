import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 읽어옵니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력을 long 타입으로 변환합니다.
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());

        // pow 메서드를 호출하여 결과를 출력합니다.
        System.out.println(pow(A, B, C));
        br.close();
    }

    static long pow(long A, long B, long mod) {
        // 지수가 1인 경우, A를 mod로 나눈 나머지를 반환합니다.
        if (B == 1) {
            return A % mod;
        }

        // 재귀적으로 pow 메서드를 호출하여 값을 계산합니다.
        long x = pow(A, B / 2, mod);

        // (A*A) % C == (A % C) * (A % C) % C
        // 지수가 홀수인 경우, x * x * A를 mod로 나눈 나머지를 반환합니다.
        if (B % 2 == 1) {
            return (x * x % mod) * A % mod;
        }

        // 지수가 짝수인 경우, x * x를 mod로 나눈 나머지를 반환합니다.
        return x * x % mod;
    }
}
