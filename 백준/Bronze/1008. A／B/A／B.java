import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.printf("%.10f", a / b);

    }
}