import java.io.*;
import java.util.*;

public class Main {

    static class Node {
        int vertex; // 정점 번호
        int weight; // 간선 가중치
        Node(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
    
    static ArrayList<Node>[] list; // 그래프를 저장하기 위한 인접 리스트
    static int[] dist; // 시작 정점으로부터의 최단 거리를 저장하는 배열
    static boolean[] visited; // 정점의 방문 여부를 확인하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 빠른 입력을 위한 BufferedReader
        StringTokenizer st = new StringTokenizer(br.readLine()); // 입력을 파싱하기 위한 Tokenizer
        StringBuilder sb = new StringBuilder(); // 빠른 출력을 위한 StringBuilder
        int V = Integer.parseInt(st.nextToken()); // 정점의 수
        int E = Integer.parseInt(st.nextToken()); // 간선의 수
        int start = Integer.parseInt(br.readLine()); // 시작 정점
        list = new ArrayList[V + 1]; // 인접 리스트 초기화
        dist = new int[V + 1]; // 거리 배열 초기화
        visited = new boolean[V + 1]; // 방문 배열 초기화

        for (int i = 1; i <= V; i++) {
            dist[i] = Integer.MAX_VALUE; // 초기 거리를 무한대로 설정
            list[i] = new ArrayList<>(); // 각 리스트를 초기화
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken()); // 간선의 시작 정점
            int v2 = Integer.parseInt(st.nextToken()); // 간선의 끝 정점
            int w = Integer.parseInt(st.nextToken()); // 간선의 가중치
            list[v1].add(new Node(v2, w)); // 인접 리스트에 간선 추가
        }
        
        dijkstra(start); // 다익스트라 알고리즘 호출

        for (int i = 1; i <= V; i++) {
            sb.append(dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]).append("\n"); // 최단 거리를 StringBuilder에 추가
        }
        
        System.out.println(sb); // 최종 거리 출력
        br.close(); // BufferedReader 닫기
    }

    static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight); // 다익스트라 알고리즘을 위한 우선순위 큐
        pq.add(new Node(start, 0)); // 시작 정점을 큐에 추가
        dist[start] = 0; // 시작 정점의 거리는 0
        
        while (!pq.isEmpty()) {
            Node cur = pq.poll(); // 거리가 가장 작은 정점을 가져옴
            visited[cur.vertex] = true; // 현재 정점을 방문했다고 표시
            
            for (Node n : list[cur.vertex]) {
                // 이웃한 정점이 방문되지 않았고, 더 짧은 경로를 찾은 경우
                if (!visited[n.vertex] && cur.weight + n.weight < dist[n.vertex]) {
                    dist[n.vertex] = cur.weight + n.weight; // 최단 거리 갱신
                    pq.add(new Node(n.vertex, dist[n.vertex])); // 이웃한 정점을 큐에 추가
                }
            }
        }
    }
}
