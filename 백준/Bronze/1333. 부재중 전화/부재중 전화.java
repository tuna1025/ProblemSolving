import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int L = sc.nextInt();
        int D = sc.nextInt();

        int t = 0;

        while (true) {

            boolean hear = true;

            for (int i = 0; i < N; i++) {

                int start = i * (L + 5);
                int end = start + L;

                if (t >= start && t < end) {
                    hear = false;
                    break;
                }
            }

            if (hear) {
                System.out.println(t);
                break;
            }

            t += D;
        }
    }
}