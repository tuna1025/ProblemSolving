import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong();
        long w = sc.nextLong();
        long m = sc.nextLong();

        if (k >= w) {
            System.out.println(0);
        } else {
            long need = w - k;
            long hits = (need + m - 1) / m;
            System.out.println(hits);
        }
    }
}