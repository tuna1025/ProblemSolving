import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 고정된 앞 10자리
        String base = "9780921418";

        // 마지막 3자리 입력
        String last = sc.nextLine() + sc.nextLine() + sc.nextLine();

        String isbn = base + last;

        int sum = 0;

        for (int i = 0; i < 13; i++) {
            int digit = isbn.charAt(i) - '0';

            if (i % 2 == 0) {      // 홀수 자리(1번째부터)
                sum += digit * 1;
            } else {               // 짝수 자리
                sum += digit * 3;
            }
        }

        System.out.println("The 1-3-sum is " + sum);
    }
}