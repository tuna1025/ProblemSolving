import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            boolean flag = true;
            for(int j = 2; j <= 1000000; j++) {
                if (a % j == 0) {
                    System.out.println("NO");
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println("YES");
            }
        }

        scanner.close();
    }
}