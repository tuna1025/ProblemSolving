import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Main {
    static int vertex;
    static int edge;
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        vertex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        graph = new int[vertex+1][vertex+1];

        for(int i = 1; i<edge+1; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }//무방향 그래프이기 때문에 ab==ba

        boolean[] visited = new boolean[vertex+1];
        System.out.println(dfs(start,visited,new StringBuilder()));
        visited = new boolean[vertex+1];
        System.out.println(bfs(start,visited));
        br.close();
    }

    static String dfs(int start, boolean[] visited, StringBuilder sb){ //dfs는 재귀호출이기 때문에 스트링빌더 객체를 전달해줘야함
        visited[start] = true;
        sb.append(start).append(" ");//sb.append(start +" ")는 새로운 객체" "를 생성하기 때문에 비효율적
        for (int i = 1; i <= vertex; i++) {
            if (!visited[i] && graph[start][i] == 1) {
                dfs(i, visited,sb);
            }
        }//현재 정점과 열결된 정점 탐색
        return sb.toString();
    }

    static String bfs(int start, boolean[] visited){
        LinkedList<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        queue.add(start);
        visited[start] = true;
        
        while(!queue.isEmpty()){
            int node = queue.poll();
            sb.append(node).append(" ");

            for (int i = 0; i < graph[node].length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }//현재 정점과 열결된 정점 탐색하면 모든 그래프 탐색
            }
        }
        return sb.toString();
    }

}