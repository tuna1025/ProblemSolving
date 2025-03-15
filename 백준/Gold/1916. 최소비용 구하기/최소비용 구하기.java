import java.util.*;
import java.io.*;

public class Main {
    static int vertex; // 정점(노드)의 개수
    static ArrayList<Node>[] graph; // 그래프를 표현하기 위한 인접 리스트
    static boolean[] visited; // 방문 여부를 저장하는 배열
    static int[] dist; // 시작 노드로부터의 최소 거리 배열

    // 그래프의 간선을 나타내는 클래스
    static class Node {
        int node; // 연결된 노드
        int weight; // 간선의 가중치

        public Node(int node, int weight) {
            this.node = node;
            this.weight = weight; // 생성자로 노드와 가중치를 초기화
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 정점 개수 입력
        vertex = Integer.parseInt(br.readLine());
        int edges = Integer.parseInt(br.readLine()); // 간선 개수 입력

        // 그래프 및 기타 배열 초기화
        graph = new ArrayList[vertex + 1]; // 인덱스를 1부터 사용하기 위해 vertex+1 크기로 선언
        visited = new boolean[vertex + 1];
        dist = new int[vertex + 1];

        // 그래프와 거리 배열 초기화
        for (int i = 1; i <= vertex; i++) {
            graph[i] = new ArrayList<>(); // 각 정점마다 리스트 생성
            dist[i] = Integer.MAX_VALUE; // 초기 거리는 무한대로 설정
        }

        // 간선 정보 입력
        for (int i = 0; i < edges; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 시작 노드
            int b = Integer.parseInt(st.nextToken()); // 끝 노드
            int weight = Integer.parseInt(st.nextToken()); // 가중치
            graph[a].add(new Node(b, weight)); // 방향 그래프에 간선 추가
        }

        // 시작 노드와 끝 노드 입력
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken()); // 출발 노드
        int end = Integer.parseInt(st.nextToken()); // 도착 노드

        // 다익스트라 알고리즘 실행
        dijkstra(start);

        // 결과 출력: 도착 노드까지의 최소 거리
        System.out.println(dist[end]);
    }

    // 다익스트라 알고리즘 구현
    static void dijkstra(int start) {
        // 최소 가중치를 기준으로 정렬하는 우선순위 큐
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.weight - o2.weight);
        pq.add(new Node(start, 0)); // 시작 노드를 큐에 추가
        dist[start] = 0; // 시작 노드의 거리 0으로 초기화

        // 큐가 비어있을 때까지 반복
        while (!pq.isEmpty()) {
            Node now = pq.poll(); // 우선순위 큐에서 가장 가중치가 작은 노드 꺼내기
            if(visited[now.node]) continue;
            // 현재 노드와 연결된 모든 인접 노드를 확인
            visited[now.node] = true;

            for (Node next : graph[now.node]) {
                // 아직 방문하지 않았고, 더 짧은 경로가 존재하는 경우
                if (!visited[next.node] && next.weight + dist[now.node] < dist[next.node]) {

                    dist[next.node] = next.weight + now.weight; // 최소 거리 갱신
                    pq.add(new Node(next.node, dist[next.node])); // 큐에 갱신된 노드 추가
                }
            }
        }
    }
}
