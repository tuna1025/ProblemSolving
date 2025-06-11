import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int index = scanner.nextInt();
            sum += arr[index-1];
        }

        System.out.println(sum);
    }
}