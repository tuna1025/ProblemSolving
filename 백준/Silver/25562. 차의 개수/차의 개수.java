import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1. 서로 다른 차이의 최대 개수
        System.out.println(n * (n - 1) / 2); // 이건 진짜 최댓값 (모든 쌍 다름)
        // 단, 10^9 이하로 만들 수 있어야 함 → 2의 제곱 수열 사용
        long x = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(x + " ");
            x *= 2;
        }
        System.out.println();

        // 2. 서로 다른 차이의 최소 개수
        System.out.println(n - 1);
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
