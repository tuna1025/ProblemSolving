import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수를 읽습니다.
        while(T-->0){
            int n = Integer.parseInt(br.readLine()); // 열의 수를 읽습니다.
            int[][] arr = new int[2][n+1]; // 스티커 값을 저장할 배열을 생성합니다.
            int[][] cost = new int[2][n+1]; // 각 열까지의 최대 비용을 저장할 배열을 생성합니다.
            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken()); // 스티커 값을 초기화합니다.
                }
            } // 스티커 입력 종료
            
            // 첫 번째 열의 비용을 초기화합니다.
            cost[0][1] = arr[0][1];
            cost[1][1] = arr[1][1]; // 첫 번째 열, 두 행 중 최대 값을 선택합니다.
            
            for(int i = 2; i <= n; i++){
                // 위쪽 행의 스티커를 선택했을 때의 최대 비용
                cost[0][i] = Math.max(cost[1][i-1], cost[1][i-2]) + arr[0][i];
                
                // 아래쪽 행의 스티커를 선택했을 때의 최대 비용
                cost[1][i] = Math.max(cost[0][i-1], cost[0][i-2]) + arr[1][i];
            }
            
            // 마지막 열의 최대 비용을 출력합니다.
            System.out.println(Math.max(cost[0][n], cost[1][n]));
        }
        br.close(); // BufferedReader를 닫습니다.
    }

}
