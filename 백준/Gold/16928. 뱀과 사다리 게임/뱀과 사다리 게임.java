import java.io.*;
import java.util.*;

public class Main {
    static int[] board = new int[101];
    static int[] visited = new int[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= 100; i++) {
            board[i] = i;
        }
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x] = y;
        }// 사다리 입력
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x] = y;
        }// 뱀 입력
        bfs();
        System.out.println(visited[100]);

    }
    static void bfs(){
        Queue<Integer> q = new LinkedList<>();
        q.add(1); // 1부터 시작
        visited[1] = 0;
        while(!q.isEmpty()){
            int index = q.poll();
            for(int i = 1; i <= 6; i++){
                int next = index + i;
                if(next > 100) continue;

                if(visited[board[next]] == 0){
                    q.add(board[next]);
                    visited[board[next]] = visited[index] + 1;
                }
            }
        }
    }
}
