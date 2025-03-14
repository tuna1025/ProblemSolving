import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken()); // 행의 수
        int M = Integer.parseInt(st.nextToken()); // 쿼리의 수
        int[][] arr = new int[N+1][N+1]; // 입력된 배열을 저장할 2차원 배열

        // 배열 초기화
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                arr[i][j] =  arr[i][j-1] + Integer.parseInt(st.nextToken());

            }
        }

        // 배열 출력 (디버깅용)
        

        // 쿼리 처리
        while(M-->0){
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int i = x1; i <= x2; i++) {
                sum = sum + (arr[i][y2] - arr[i][y1-1]);
            }
            sb.append(sum + "\n");
        }
        // 결과 출력
        System.out.println(sb);
    }


}

