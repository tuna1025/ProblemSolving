import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double T = sc.nextDouble();

        double result = (T * T) / 4.0;

        System.out.println((int)Math.round(result));
    }
}