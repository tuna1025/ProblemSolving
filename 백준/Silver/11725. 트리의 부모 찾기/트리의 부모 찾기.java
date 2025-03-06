import java.io.*;
import java.util.*;

public class Main {
    static List<Integer>[] graph;
    static boolean[] visited; // 방문한 노드를 추적하는 배열
    static int[] parent; // DFS 트리에서 각 노드의 부모를 저장하는 배열
    static int N; // 그래프의 노드 수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine()); // 노드 수 입력
        graph = new ArrayList[N+1]; // 그래프 인접 행렬 초기화
        visited = new boolean[N+1]; // 방문 배열 초기화
        parent = new int[N+1]; // 부모 배열 초기화

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }// add를 하기위해 각 배열 초기화

        // 간선을 읽어 그래프를 구성
        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);// 간선을 인접 행렬에 표시
            graph[b].add(a);
        }// 인접행렬을 사용하게 되면 부모노드를 저장하기 위한 배열 때문인지 메모리 초과가 뜸

        // 1번 노드부터 DFS 수행
        dfs(1);

        // 각 노드의 부모를 출력
        for (int i = 2; i < N+1; i++) {
            System.out.println(parent[i]);
        }
    }

    // 깊이 우선 탐색 (DFS) 함수
    static void dfs(int node) {
        visited[node] = true; // 현재 노드를 방문 표시
        for (int i: graph[node]) {
            // 방문하지 않은 인접 노드를 모두 방문
            if (!visited[i]) {
                parent[i] = node; // 노드의 부모 설정
                dfs(i); // 인접 노드를 재귀적으로 방문
            }
        }
    }
}
