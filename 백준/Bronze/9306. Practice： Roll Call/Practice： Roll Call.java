import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine(); // 개행 제거

        for (int i = 1; i <= T; i++) {
            String first = sc.nextLine();
            String last = sc.nextLine();

            System.out.println("Case " + i + ": " + last + ", " + first);
        }

        sc.close();
    }
}