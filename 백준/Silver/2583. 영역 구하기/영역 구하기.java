import java.util.*;
import java.io.*;

class Main {
    static int N,M;
    static int[][]map;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int cnt, size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());  // 그릴 직사각형 개수
        map = new int[M][N];
        visited = new boolean[M][N];
        for (int i = 0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken()); // 왼쪽아래 (x1, y1)
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken()); // 오른쪽 위 (x2,y2)
            for (int x = x1; x < x2; x++){
                for (int y = y1; y < y2; y++){
                    map[y][x] = 1;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                if(map[i][j] == 0 && !visited[i][j]){
                    size = 1;
                    cnt++;
                    dfs(i, j);
                    list.add(size);
                }
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for(int i: list){
            System.out.print(i + " ");
        }
    }

    public static void dfs(int a, int b) {
        visited[a][b] = true;
        for (int i = 0; i < 4; i++) {
            int x = a + dx[i];
            int y = b + dy[i];

            if(x < 0 || x >= M || y < 0 || y >= N )continue;

            if(map[x][y] == 0 && !visited[x][y]){
                visited[x][y] = true;
                size++;
                dfs(x, y);
            }
        }
    }
}