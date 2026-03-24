import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int max = 0;

            for (int j = 0; j < 5; j++) {
                int w = sc.nextInt();
                if (w > max) max = w;
            }

            System.out.println("Case #" + i + ": " + max);
        }
    }
}