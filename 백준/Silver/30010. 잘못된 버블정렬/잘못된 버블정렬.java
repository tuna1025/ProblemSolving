import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N 입력 (3 <= N <= 1,000)
        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();

        // 가장 확실한 반례인 내림차순 수열 생성 및 출력
        // StringBuilder를 사용하여 출력 성능 최적화
        StringBuilder counterExample = new StringBuilder();
        for (int i = n; i >= 1; i--) {
            counterExample.append(i);
            if (i > 1) {
                counterExample.append(" ");
            }
        }

        System.out.println(counterExample.toString());
        scanner.close();
    }
}