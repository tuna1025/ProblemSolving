import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt();
        String K = scanner.next();

        // 짝수와 홀수 개수 세기
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < K.length(); i++) {
            char digit = K.charAt(i);
            if ((digit - '0') % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // 결과 출력
        if (evenCount > oddCount) {
            System.out.println(0); // 짝짝수
        } else if (oddCount > evenCount) {
            System.out.println(1); // 홀홀수
        } else {
            System.out.println(-1); // 둘 다 아님
        }

        scanner.close();
    }
}
