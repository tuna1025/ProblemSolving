import java.io.*;
import java.util.*;


public class Main {
    static int N, M;
    static int[][] map;
    static boolean[][][] visited;
    static int[] dx = {-1, 1,0, 0};
    static int[] dy = {0,0,-1, 1};

    static class Now{
        int x;
        int y;
        int cnt; //전역변수로 하면 벽부수는 경우와 안부수고 이동하는 경우가 중복 체크될수도 있어서 따로 매개변수로 함
        boolean destroyed;
        public Now(int x, int y,int cnt, boolean destroyed) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
            this.destroyed = destroyed;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M][2]; // 벽을 부수고 가는경우와 부수지 않고 가는경우를 찾음
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }//배열 입력
        System.out.println(bfs());
    }

    static int bfs(){
        Queue<Now> q = new LinkedList<>();
        q.add(new Now(0,0, 1, false));
        while (!q.isEmpty()) {
            Now now = q.poll();
            if(now.x == N-1 && now.y == M-1){
               return now.cnt;
            }

            int nextCnt = now.cnt + 1;

            // 상하좌우 탐색
            for (int i = 0; i < 4; i++) {
                int x = now.x + dx[i];
                int y = now.y + dy[i];

                if(x<0 || x>=N || y<0 || y>=M) continue;

                if(map[x][y] == 0) { //벽이 아닌경우 일떄
                    if(!visited[x][y][0] && !now.destroyed){
                        q.add(new Now(x,y,nextCnt,false));
                        visited[x][y][0] = true;
                    }//부수지 않은경우
                    else if(!visited[x][y][1] && now.destroyed){
                        q.add(new Now(x,y,nextCnt,true));
                        visited[x][y][1] = true;
                    } // 한번 부순경우
                }
                else{ // 벽을 한번도 부수지 않은 경우
                    if(!visited[x][y][1] && !now.destroyed){
                        q.add(new Now(x,y,nextCnt,true));
                        visited[x][y][1] = true;
                    }// 부수고 이동

                }
            }

        }
        return -1;
    }
}