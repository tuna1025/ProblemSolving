import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 물품의 개수
        int K = Integer.parseInt(st.nextToken()); // 배낭의 용량
        int[] W = new int[N + 1]; // 물건의 무게
        int[] V = new int[N + 1]; // 물건의 가치
        int[][] dp = new int[N + 1][K + 1]; // DP 테이블 생성

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            W[i] = Integer.parseInt(st.nextToken());
            V[i] = Integer.parseInt(st.nextToken());
        }

        // 3가지 경우가 있음 1.물건을 넣거나 2. 안넣거나 3. 못넣거나
        // 배낭의 남은 무게가 나머지 물건들의 무게보다 크면 다 집어넣기 or 작으면 다버리기
        // 그런데 이거 확인 할 시간이면 더 비효율적이려나?
        for (int i = 1; i <= N; i++) { // i는 현재 고려 중인 물건
            for (int j = 1; j <= K; j++) { // j는 현재 배낭의 허용 용량
                if (W[i] > j) { 
                    // 현재 물건의 무게가 배낭 용량을 초과하면 넣을 수 없음
                    dp[i][j] = dp[i - 1][j]; // 이전 단계의 값을 그대로 가져옴
                } else { 
                    // 물건을 넣을 수 있는 경우: 넣거나 넣지 않는 경우 중 최대 값 선택
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i]] + V[i]);
                }
            }
        }
        System.out.println(dp[N][K]); // 최종적으로 DP 테이블에서 최대 가치 출력
        br.close(); // 입력 버퍼 닫기
    }
}
