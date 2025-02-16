import java.util.*;
import java.io.*;

class Main {
    static int M,N;
    static char[][] map;
    static boolean[][] visited;
    static int[][] result;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new char[M][N];
        visited = new boolean[M][N];
        result = new int[M][N];
        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }//미로입력
        bfs(0, 0);

        System.out.println(result[M-1][N-1]);

        br.close();
    }

    public static void bfs(int StartX, int StartY) {
        LinkedList<int[]> queue = new LinkedList<>();
        visited[StartX][StartY] = true;
        queue.offer(new int[]{StartX, StartY});
        result[StartX][StartY] = 1;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = cur[0] + dx[i];
                int y = cur[1] + dy[i];

                if(x >= 0 && x < M && y >= 0 && y < N && !visited[x][y] && map[x][y] == '1') {
                    visited[x][y] = true;
                    queue.offer(new int[]{x, y});
                    result[x][y] = result[cur[0]][cur[1]] + 1;
                }
            }
        }
    }
}