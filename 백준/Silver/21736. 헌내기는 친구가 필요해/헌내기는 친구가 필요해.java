import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int N,M;
    static char[][] campus;
    static boolean[][] visited;
    static int[] x = new int[]{-1,1,0,0};
    static int[] y = new int[]{0,0,-1,1};
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        campus = new char[N][M];
        visited = new boolean[N][M];
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                campus[i][j] = s.charAt(j);
                if (campus[i][j] == 'I') {
                    startX = i;
                    startY = j;
                }//시작좌표 찾으면서
            }
        }//대학교 지도 입력

        dfs(startX, startY);
        if(cnt == 0){
            System.out.println("TT");
        }//아무도 못만나면 TT출력
        else System.out.println(cnt);
        br.close();
    }

    public static void dfs(int a,int b){
        visited[a][b] = true;

        for(int k = 0; k < 4; k++){
            int nextX = a+x[k];
            int nextY = b+y[k];//좌표갱신
            if(nextX >= 0 && nextX < N && nextY >= 0 && nextY < M){//캠퍼스 범위체크
                if(!visited[nextX][nextY] && campus[nextX][nextY] != 'X'){//벽이 있으면 못지나감
                    if (campus[nextX][nextY] == 'P')cnt++;//사람을 만나면 cnt증가
                    dfs(nextX,nextY);
                }
            }


        }
    }
}