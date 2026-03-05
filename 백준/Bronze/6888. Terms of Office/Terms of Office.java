import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        for (int year = X; year <= Y; year += 60) {
            System.out.println("All positions change in year " + year);
        }
    }
}