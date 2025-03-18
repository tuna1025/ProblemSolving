import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n+1][3];
        int[][] dpMax = new int[n+1][3];
        int[][] dpMin = new int[n+1][3];
        for(int i = 1; i <= n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            board[i][0] = Integer.parseInt(st.nextToken());
            board[i][1] = Integer.parseInt(st.nextToken());
            board[i][2] = Integer.parseInt(st.nextToken());
        }// 목록 입력받기

        for(int i = 1; i <= n; i++){
            dpMin[i][0] += Math.min(dpMin[i-1][0], dpMin[i-1][1])+ board[i][0];
            dpMin[i][1] += Math.min(dpMin[i-1][0], Math.min(dpMin[i-1][1],dpMin[i-1][2]))+ board[i][1];
            dpMin[i][2] += Math.min(dpMin[i-1][1], dpMin[i-1][2])+ board[i][2];

            dpMax[i][0] += Math.max(dpMax[i-1][0], dpMax[i-1][1])+ board[i][0];
            dpMax[i][1] += Math.max(dpMax[i-1][0], Math.max(dpMax[i-1][1],dpMax[i-1][2]))+ board[i][1];
            dpMax[i][2] += Math.max(dpMax[i-1][1],dpMax[i-1][2])+ board[i][2];
        } //인덱스가 0일때 0과1, 1일때 0,1,2 , 2일때 1,2로만 움직일 수 있다. 
        
        System.out.print(Math.max(dpMax[n][0], Math.max(dpMax[n][1], dpMax[n][2])) + " ");
        System.out.println(Math.min(dpMin[n][0], Math.min(dpMin[n][1], dpMin[n][2])));
        br.close();
    }
}