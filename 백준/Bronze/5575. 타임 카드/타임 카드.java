import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3명의 직원에 대해 반복 처리
        for (int i = 0; i < 3; i++) {
            // 출근 시간 입력 (h, m, s)
            int startH = scanner.nextInt();
            int startM = scanner.nextInt();
            int startS = scanner.nextInt();

            // 퇴근 시간 입력 (h, m, s)
            int endH = scanner.nextInt();
            int endM = scanner.nextInt();
            int endS = scanner.nextInt();

            // 1. 모든 시간을 초 단위로 환산
            int startTotalSeconds = calculateTotalSeconds(startH, startM, startS);
            int endTotalSeconds = calculateTotalSeconds(endH, endM, endS);

            // 2. 총 근무 시간(초) 계산
            int durationSeconds = endTotalSeconds - startTotalSeconds;

            // 3. 다시 시, 분, 초로 변환하여 출력
            printFormattedTime(durationSeconds);
        }

        scanner.close();
    }

    private static int calculateTotalSeconds(int h, int m, int s) {
        return (h * 3600) + (m * 60) + s;
    }

  
    private static void printFormattedTime(int totalSeconds) {
        int h = totalSeconds / 3600;
        int m = (totalSeconds % 3600) / 60;
        int s = totalSeconds % 60;

        System.out.println(h + " " + m + " " + s);
    }
}