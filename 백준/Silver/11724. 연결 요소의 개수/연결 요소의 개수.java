import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
    static int vertex;
    static int edge;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        vertex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        graph = new int[vertex+1][vertex+1];
        visited = new boolean[vertex+1];
        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }//그래프 입력

        int cnt = 0;
        for (int i = 1; i <= vertex; i++) {
            if (!visited[i]) {
                cnt++;
                bfs(i);
            }
        }
        System.out.println(cnt);
    }

    public static void bfs(int i) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int j = 0; j < graph[temp].length; j++) {
                if (!visited[j] &&graph[temp][j] == 1) {
                    visited[j] = true;
                    queue.add(j);
                }
            }
        }
    }
}