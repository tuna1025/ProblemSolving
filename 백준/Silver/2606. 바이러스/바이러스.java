import java.io.*;
import java.util.StringTokenizer;

class Main {
    static boolean visited[];
    static int[][] graph;
    static int cnt = 0;
    static int vertex;
    static int edge;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        vertex = Integer.parseInt(br.readLine()); //정점의 개수
        edge = Integer.parseInt(br.readLine()); //간선의 개수
        graph = new int[vertex+1][vertex+1]; //입력이 1부터 시작되므로 1
        visited = new boolean[vertex+1]; //방문 여부 확인용

        for (int i = 0; i < edge; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1; //무방향 그래프이기 때문에 인접행렬에서 대칭좌표로 표현
        }

        dfs(1);

        System.out.println(cnt-1); //1번 컴퓨터 제외

        br.close();
    }

    public static void dfs(int start){
        cnt++;
        visited[start] = true;

        for(int i = 1; i <= vertex; i++){
            if(!visited[i] && graph[start][i] == 1){
                dfs(i);
            }
        }
    }
}
