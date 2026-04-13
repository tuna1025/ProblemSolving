import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] K = new int[M];
        for (int i = 0; i < M; i++) {
            K[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < M; j++) {
                if (i % K[j] == 0) {
                    sum += i;
                    break; 
                }
            }
        }

        System.out.println(sum);
    }
}