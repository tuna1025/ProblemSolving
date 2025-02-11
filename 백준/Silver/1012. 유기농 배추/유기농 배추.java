import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int vertex;
    static int edge;
    static boolean[][] visited;
    static int[][] baechu;
    static int N,M,K;
    static int[] x= new int[]{0,0,-1,1};
    static int[] y= new int[]{1,-1,0,0};//격자를 탐색하기 때문에 좌표를 갱신하기 위해 상하좌우로 움직임
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //테스트케이스 수

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());//MxN 배추밭 가로길이
            N = Integer.parseInt(st.nextToken());//MxN 배추밭 세로길이
            K = Integer.parseInt(st.nextToken());//배추가 심어져있는 위치의 개수

            baechu = new int[M][N];
            visited = new boolean[M][N];
            int cnt = 0;
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                baechu[a][b] = 1;
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (!visited[i][j] && baechu[i][j] == 1) {
                        cnt++;
                        dfs(i, j);
                    }
                }
            }//밭 전채를 탐색하면서 방문하지 않았으면서 배추가 있는 군락에 진입하면 cnt증가

            System.out.println(cnt);
        }


        br.close();
    }

    public static void dfs(int a, int b) {
        visited[a][b] = true;

        for (int i = 0; i < 4; i++) {
            int next_x = a + x[i];
            int next_y = b + y[i];//상하좌우 탐색을 위한 좌표갱신

            if(next_x >= 0 && next_x < M &&next_y >=0 &&next_y < N){
                if(!visited[next_x][next_y] && baechu[next_x][next_y] == 1) {
                    dfs(next_x, next_y);
                }
            }
        }
    }//최초로 전달받은 x,y좌표에서 탐색시작

}