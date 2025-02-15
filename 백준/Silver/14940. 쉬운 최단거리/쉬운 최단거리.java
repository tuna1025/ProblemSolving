import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int M,N;
    static int[][] matrix;
    static boolean[][] visited;
    static int[] dx = new int[] {1,0,-1,0};
    static int[] dy = new int[] {0,1,0,-1};
    static int[][] result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        matrix = new int[M][N];
        result = new int[M][N];
        visited = new boolean[M][N];
        int startX = 0, startY = 0;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int temp = Integer.parseInt(st.nextToken());
                matrix[i][j] = temp;
                if (temp == 2){
                    startX = i;
                    startY = j;
                }
            }
        }// 시작 좌표 찾으면서 지도 입력

        bfs(startX,startY);

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (result[i][j] == 0 && matrix[i][j] == 0 || matrix[i][j] == 2){
                    sb.append(result[i][j]).append(" ");
                }//원래 지나갈 수 없는 경우 나 시작좌표면 그냥 출력
                else if (result[i][j] == 0){
                    sb.append(-1).append(" ");
                } //지나갈 수 있는 길인데 막혀서 못가면 -1출력
                else sb.append(result[i][j]).append(" "); //거리 출력
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();

    }

    public static void bfs(int startX, int startY) {
        Queue<int[]> queue = new LinkedList<>(); //좌표를 저장할 큐생성
        queue.add(new int[]{startX, startY}); //시작좌표 더해주기
        visited[startX][startY] = true; //시작좌표 방문처리

        while (!queue.isEmpty()) {
            int[] cur = queue.poll(); //현재좌표
            for (int i = 0; i < 4; i++) {
                int x = cur[0] + dx[i];
                int y = cur[1] + dy[i];

                if (x >= 0 && x < M && y >= 0 && y < N && !visited[x][y] && matrix[x][y] == 1) {
                    queue.add(new int[]{x, y});
                    visited[x][y] = true;
                    result[x][y] += result[cur[0]][cur[1]] + 1; //현제 좌표에다가 이전좌표의 거리에서 + 1
                }//맵 안에 있고 방문하지 않았고 이동할 수 있을때 다음 좌표로 이동
            }//x,y좌표 갱신
        }
    }
}