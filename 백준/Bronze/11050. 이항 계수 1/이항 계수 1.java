import java.util.*;

public class Main {

    static int fact(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int result = fact(N) / (fact(K) * fact(N - K));

        System.out.println(result);
    }
}