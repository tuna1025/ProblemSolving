import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int speed = sc.nextInt();

        int over = speed - limit;

        if (over <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            int fine;
            if (over <= 20) {
                fine = 100;
            } else if (over <= 30) {
                fine = 270;
            } else {
                fine = 500;
            }
            System.out.println("You are speeding and your fine is $" + fine + ".");
        }
    }
}