import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 첫 번째 항
            int b = Integer.parseInt(st.nextToken()); // 차이값
            int c = Integer.parseInt(st.nextToken()); // 확인할 값

            // 종료 조건
            if (a == 0 && b == 0 && c == 0) {
                return;
            }

            // 등차수열 여부를 계산
            if ((c - a) % b == 0) { // c가 a로부터 b의 배수만큼 떨어져 있는지 확인
                int term = (c - a) / b + 1; // 몇 번째 항인지 계산
                if (term > 0) { // 양수인 경우만 출력
                    System.out.println(term);
                } else {
                    System.out.println("X"); // 음수는 등차수열에 포함되지 않음
                }
            } else {
                System.out.println("X"); // 등차수열에 포함되지 않는 경우
            }
        }
    }
}