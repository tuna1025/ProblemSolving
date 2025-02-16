import java.io.*;
import java.util.*;

class Main {
    static int[][] graph; // 그래프를 나타내는 2차원 배열
    static int[][] result; // 도달 가능성을 저장할 배열
    static int N; // 그래프의 노드 수
    static boolean[] visited; // 방문한 노드를 기록하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine()); // 노드 수를 입력받음
        graph = new int[N][N]; // N x N 크기의 그래프 초기화
        result = new int[N][N]; // 결과 배열 초기화
        visited = new boolean[N]; // 방문 배열 초기화
        StringTokenizer st;

        // 그래프 입력 받기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int a = Integer.parseInt(st.nextToken());
                graph[i][j] = a; // 입력 값을 그래프에 저장
            }
        }

        // 각 노드에서 DFS 수행
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[j] && (graph[i][j] == 1)) { // 노드 i에서 j로의 간선이 있는 경우
                    dfs(i, j); // DFS 호출
                }
            }
            Arrays.fill(visited, false); // 방문 배열 초기화
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(result[i][j]).append(" "); // 결과 배열 출력
            }
            sb.append("\n");
        }
        System.out.println(sb); // 결과 출력
        br.close(); // BufferedReader 닫기
    }

    // 깊이 우선 탐색(DFS) 함수
    static void dfs(int x, int y) {
        visited[y] = true; //y는 현재 탐색 중인 노드 DFS를 수행하면서 다른 노드에 도달할 때마다 해당 노드를 방문했다고 표시
        result[x][y] = 1; // 도달할 수 있는 노드 표시
        for (int i = 0; i < N; i++) {
            if (!visited[i] && (graph[y][i] == 1)) { // 노드 y에서 i로의 간선이 있는 경우
                dfs(x, i); // DFS 재귀 호출
            }
        }
    }
    /*dfs(x, y)를 호출하면, 현재 y 노드를 방문했다고 표시하고, result 배열에 기록합니다. 그런 다음
    y 노드에서 갈 수 있는 다른 노드를 재귀적으로 탐색 
    이 과정에서 다음 노드가 i인 경우, 방문하지 않은 i 노드와 연결되어 있다면 다시 dfs(x, i)를 호출*/
    
}
