import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 배열의 크기를 입력받음
        StringTokenizer st = new StringTokenizer(br.readLine()); // 배열의 요소들을 입력받음
        int[] arr = new int[N]; // 입력받은 숫자들을 저장할 배열
        int[] dp = new int[N]; // 각 위치에서의 가장 긴 증가하는 부분 수열의 길이를 저장할 배열
        int max = Integer.MIN_VALUE; // 가장 긴 부분 수열의 길이를 저장할 변수 초기화
        
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 배열 요소들을 저장
        }
        
        for (int i = 0; i < N; i++) {
            dp[i] = 1; // 초기 길이를 1로 설정
            
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) { // 이전 요소가 현재 요소보다 작을 경우
                    dp[i] = Math.max(dp[i], dp[j] + 1); // dp 값을 업데이트
                }
            }
        }
        
        for (int i = 0; i < N; i++) {
            max = Math.max(dp[i], max); // 가장 긴 길이를 갱신
        }
        
        System.out.println(max); // 가장 긴 증가하는 부분 수열의 길이 출력
    }
}
