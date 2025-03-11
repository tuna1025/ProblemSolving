import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][]dp = new int[n+1][n+1];
        int[][]res = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                res[i][j] = Math.max(res[i-1][j], res[i-1][j-1]) + dp[i][j];
            } // i,j번쨰의 위치에서의 더할수 있는 이전거의 위치는 i-1,j/i-1.j-1이다
        }

        int max = 0;
        for(int i = 1; i <= n; i++) {
            max = Math.max(max, res[n][i]);
        } //res의 마지막 줄에 경로별 누접합이 기록되기 때문에 여기서의 최대값을 찾는다
        System.out.println(max);
        
        br.close();
    }

}