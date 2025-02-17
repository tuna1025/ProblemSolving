import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    // 그래프와 방문 여부를 저장하는 배열 선언
    static int[][] graph;
    static boolean[] visited;
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 입력을 받아 노드의 수 (M)와 간선의 수 (N)를 초기화
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());//정점의 수
        N = Integer.parseInt(st.nextToken());//간선의 수

        // 그래프와 방문 배열 초기화
        graph = new int[M + 1][M + 1];
        visited = new boolean[M + 1];

        // 간선 정보를 입력받아 그래프 생성 (무방향 그래프)
        for (int i = 1; i < N + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }

        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        // 각 노드에서 BFS를 수행하여 최소 노드 갱신
        for (int i = 1; i < M + 1; i++) {
            int cnt = bfs(i);
            if (cnt < min) {
                min = cnt;
                minIndex = i;
            }
        }// 같은 경우면 먼저 나온 노드로 갱신

        System.out.println(minIndex);
        br.close();
    }

    // BFS를 사용하여 각 노드까지의 최단 거리를 계산하고 합산
    public static int bfs(int i) {
        Queue<Integer> q = new LinkedList<>();

        // 방문 배열과 거리 배열 초기화
        Arrays.fill(visited, false);
        int[] distance = new int[M + 1];
        int cnt = 0;

        // 시작 노드를 큐에 추가하고 방문 처리
        q.add(i);
        visited[i] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();

            // 현재 노드와 연결된 모든 노드를 탐색
            for (int v = 0; v < graph.length; v++) {
                // 방문하지 않았고, 연결된 노드인 경우
                if (!visited[v] && graph[v][cur] == 1) {
                    q.add(v);
                    visited[v] = true;

                    // 거리를 갱신하고 합산
                    distance[v] += distance[cur] + 1;
                    cnt += distance[v];
                }
            }
        }

        // 총 이동 거리를 반환
        return cnt;
    }
}
