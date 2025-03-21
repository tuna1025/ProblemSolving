import com.sun.jdi.IntegerValue;
import com.sun.jdi.Value;

import java.io.*;
import java.util.*;

class Node{
    int vertex;
    int weight;

    Node(int vertex, int weight){
        this.vertex = vertex;
        this.weight = weight;
    }
}

public class Main {
    static int v1,v2,N;
    static final int INF = 200000*1000; // 숫자가 너무 크면 오버플로우남, 간선 최대개수 * 최대가중치
    static ArrayList<Node>[] graph;
    static boolean[] visited;
    static int[] dist;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        dist = new int[N+1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        } // 일반 원시형 배열처럼 Arrays.fill써봤는데 그러면 하나의 객체로 취급되서 경로가 꼬임

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph[v1].add(new Node(v2, w));
            graph[v2].add(new Node(v1, w));
        }// 양방향 그래프

        st = new StringTokenizer(br.readLine());
        v1 = Integer.parseInt(st.nextToken());
        v2 = Integer.parseInt(st.nextToken());
        int ans1 = 0;
        int ans2 = 0;
        // 1 -> v1 -> v2 -> N 인경우
        ans1 += dijkstra(1,v1);
        ans1 += dijkstra(v1,v2);
        ans1 += dijkstra(v2,N);

        // 1-> v2 -> v1 -> N 인경우
        ans2 += dijkstra(1,v2);
        ans2 += dijkstra(v2,v1);
        ans2 += dijkstra(v1,N);

        // 경로가 없으면 == 거리가 INF 이상이면 -1 아니면 두경로중 최소값
        int res = (ans1 >= INF && ans2 >= INF) ? -1 : Math.min(ans1, ans2);

        System.out.println(res);

        br.close();
    }
    public static int dijkstra(int start, int end) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->a.weight - b.weight);
        pq.add(new Node(start,0));
        Arrays.fill(visited, false);
        Arrays.fill(dist, INF);
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node now = pq.poll();

            if(visited[now.vertex])continue;
            visited[now.vertex] = true;

            for (Node n : graph[now.vertex]) {
                if(!visited[n.vertex] && now.weight + n.weight < dist[n.vertex]) {
                    // v1,v2를 지나는 경로여야함
                    dist[n.vertex] = now.weight + n.weight;
                    pq.add(new Node(n.vertex,dist[n.vertex]));
                }
            }
        }
        return dist[end];
    }
}
