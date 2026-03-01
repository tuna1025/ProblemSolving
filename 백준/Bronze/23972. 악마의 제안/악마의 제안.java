import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long K = sc.nextLong();
        long N = sc.nextLong();

        if (N == 1) {
            System.out.println(-1);
            return;
        }

        long X = (K * N + (N - 2)) / (N - 1);

        System.out.println(X);
    }
}