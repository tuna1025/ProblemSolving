import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();

        int s = (int)Math.sqrt(2 * W);
        System.out.println(4 * s);
    }
}