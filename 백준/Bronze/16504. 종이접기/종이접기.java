import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long Ans = 0, Tmp;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Tmp = scanner.nextLong();
                Ans += Tmp;
            }
        }

        System.out.println(Ans);
        scanner.close();
    }
}
