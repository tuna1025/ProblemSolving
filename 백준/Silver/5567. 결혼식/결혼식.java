import java.io.*;
import java.util.*;

class Main {
    static int vertex, edge;
    static int[][] map;
    static boolean[] visited;
    static int cnt = 0;

    static class Pair{
        int node;
        int depth;
        Pair(int node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        vertex = Integer.parseInt(br.readLine());
        edge = Integer.parseInt(br.readLine());
        map = new int[vertex+1][vertex+1];
        visited = new boolean[vertex+1];
        for (int i = 0; i < edge; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;
        }
        bfs();
        System.out.println(cnt);


    }
    static void bfs(){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(1, 0));
        visited[1] = true;
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int node = p.node;
            int depth = p.depth;
            
            for (int i = 1; i <= vertex; i++) {
                if (!visited[i] && map[i][node] == 1) {
                    visited[i] = true;
                    q.add(new Pair(i, depth+1));
                    if(depth + 1 <= 2)cnt++;
                }
            }
        }
    }

}

