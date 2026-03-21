import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int k = Math.min(a, N - b) + Math.min(b, N - a);

        int ans = (1 << N) - (1 << (N - k));

        System.out.println(ans);
    }
}