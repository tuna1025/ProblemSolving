import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int year = sc.nextInt();

            if (year == 2026) {
                System.out.println(name);
            }
        }
    }
}