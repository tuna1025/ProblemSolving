import java.io.*;
import java.util.*;

public class Main {
    static int[] visited;
    static List<List<Integer>> graph = new ArrayList<>();
    static int vertex, edge;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken()); // a->b로 가야됨

        st = new StringTokenizer(br.readLine());
        vertex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());


        for (int i = 0; i <= vertex; i++) {
            graph.add(new ArrayList<>());
        } // nullPointExcetion방지용 그래프 초기화

        // 간선 연결
        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u); //양방향 그래프
        }
        bfs(a);
        System.out.println(visited[b]); // b에 도착했을때의 거리 -1이면 도달불가

    }

    public static void bfs(int a) {
        visited = new int[vertex + 1];
        Arrays.fill(visited, -1); // 전부 방문하기 전으로 초기화
        Queue<Integer> queue = new LinkedList<>();
        queue.add(a);
        visited[a] = 0; // 출발 지점은 거리0
        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int n : graph.get(cur)) { // 연결된 간선만 출력
                if(visited[n] == -1) { //방문하지 않았으면
                    visited[n] = visited[cur] +1; //방문처리하고 거리 추가
                    queue.add(n);
                }
            }
        }
    }
}
