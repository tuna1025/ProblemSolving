import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        int[] diff = new int[N + 2];

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R') {
                int L = Math.max(1, i + 1 - K);
                int R = Math.min(N, i + 1 + K);
                diff[L]++;
                diff[R + 1]--;
            }
        }

        int cur = 0;
        int infected = 0;

        for (int i = 1; i <= N; i++) {
            cur += diff[i];
            if (cur > 0) infected++;
        }

        if (infected <= M) System.out.println("Yes");
        else System.out.println("No");
    }
}