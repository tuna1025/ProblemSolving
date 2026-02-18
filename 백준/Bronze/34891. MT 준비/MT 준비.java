import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int result = (N + M - 1) / M;  // 올림 나눗셈

        System.out.println(result);
    }
}