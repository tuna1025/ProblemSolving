import java.util.*;
import java.io.*;
public class Main {
    static int[][] map;
    static int n,cnt; // n == 맵의 크기, cnt == 방법의 개수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n+1][n+1];
        cnt = 0;

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        //방향은 총 3가지가 있으며, →, ↘, ↓ 방향이다. 파이프는 밀면서 회전시킬 수 있다. 회전은 45도만 회전
        dfs(1, 2, 0); //시작은 1,1과 1,2를 차지하고있음 즉 가로형태
//        for(int[] dir : map){
//            System.out.println(Arrays.toString(dir));
//        }
        System.out.println(cnt);
        br.close();
    }

    static void dfs(int x, int y, int direction) {
        //degenerate case n,n에 도달
        if (x == n && y == n){
            cnt++;
            return;
        } //끝에 도달하면 방법 추가

        // direction = 0 일떄 가로
        if(direction == 0){
            if(y+1 <= n && map[x][y+1] == 0){
                dfs(x, y+1, 0);
            }//가로 이동
            if(x+1 <=n && y+1 <= n && map[x+1][y+1] == 0 && map[x][y+1] == 0 && map[x+1][y] == 0){
                dfs(x+1, y+1, 2);
            }//대각이동
        }
        else if(direction == 1){
            if(x+1 <= n && map[x+1][y] == 0){
                dfs(x+1, y, 1);
            }// 세로이동
            if(x+1 <=n && y+1 <= n && map[x+1][y+1] == 0 && map[x][y+1] == 0 && map[x+1][y] == 0){
                dfs(x+1, y+1, 2);
            }//대각이동
        }//세로일때
        else{
            if(y+1 <= n && map[x][y+1] == 0){
                dfs(x, y+1, 0);
            }//가로 이동
            if(x+1 <= n && map[x+1][y] == 0){
                dfs(x+1, y, 1);
            }// 세로이동
            if(x+1 <=n && y+1 <= n && map[x+1][y+1] == 0 && map[x][y+1] == 0 && map[x+1][y] == 0){
                dfs(x+1, y+1, 2);
            }//대각이동
        }
    }
}