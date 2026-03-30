import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();

        for(int i = 0; i < Q; i++) {
            long a = sc.nextLong();
            long m = sc.nextLong();

            long cost = (a * m * 1056) / 600000;

            System.out.println(cost);
        }
    }
}