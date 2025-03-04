import java.io.*;
import java.util.*;


class Main {
    static int N,M,max;
    static int[][] map;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};// 상하좌우
    static boolean[][] visited;
    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        max = 0;
        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        } //숫자입력

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                visited[i][j] = true;
                maxSum(i,j,map[i][j],1);
                visited[i][j] = false;
            }
        }
        System.out.println(max);
        br.close();
    }
    static void maxSum(int x, int y, int sum, int cnt) {

        if (cnt == 4) {
            max = Math.max(max, sum);
            return;
        }//최대값 갱신

        for(int i = 0; i<4; i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i]; //좌표갱신
            if(nextY<0 || nextX<0 || nextY >= M || nextX >= N)continue;// 범위 벗어나면 바로 컷
            if(cnt == 2 && !visited[nextX][nextY]){
                visited[nextX][nextY] = true;
                maxSum(x,y,sum+map[nextX][nextY],cnt+1);
                visited[nextX][nextY] = false;
            }//ㅗ모양을 탐색하기위해 제자리에서 한번 더 탐색

            if(!visited[nextX][nextY]){
                visited[nextX][nextY] = true;
                maxSum(nextX, nextY, sum+map[nextX][nextY],cnt+1);
                visited[nextX][nextY] = false;//백트래킹을 써서 그 칸에서 가능한 모든 모양을 탐색
            }

        }

    }
}
