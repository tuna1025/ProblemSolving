import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Z = sc.nextInt();

        while (Z-- > 0) {
            int W = sc.nextInt();
            int K = sc.nextInt();

            System.out.println((W * K) / 2);
        }
    }
}