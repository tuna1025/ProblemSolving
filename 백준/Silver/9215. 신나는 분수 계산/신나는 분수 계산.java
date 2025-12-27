import java.io.*;
import java.util.*;

public class Main {

    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return Math.abs(a);
    } // 최대 공약수 구하기

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = 1;

        while (true) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n == 0) break;

            long num = 0; // 분자
            long den = 1; // 분모

            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                long a, b;

                if (s.contains(",")) {                 // 대분수
                    String[] p = s.split(",");
                    long w = Long.parseLong(p[0]);
                    String[] f = p[1].split("/");
                    long fn = Long.parseLong(f[0]);
                    long fd = Long.parseLong(f[1]);
                    a = w * fd + fn;
                    b = fd;
                } else if (s.contains("/")) {          // 분수
                    String[] f = s.split("/");
                    a = Long.parseLong(f[0]);
                    b = Long.parseLong(f[1]);
                } else {                               // 정수
                    a = Long.parseLong(s);
                    b = 1;
                }

                num = num * b + a * den;
                den = den * b;

                long g = gcd(num, den);
                num /= g;
                den /= g;
            }

            StringBuilder sb = new StringBuilder();
            sb.append("Test ").append(test++).append(": ");

            if (num == 0) {
                sb.append("0");
            } else {
                long w = num / den;
                long r = num % den;

                if (w != 0) sb.append(w);
                if (r != 0) {
                    if (w != 0) sb.append(",");
                    sb.append(r).append("/").append(den);
                }
            }

            System.out.println(sb);
        }
    }
}
