import java.io.*;
import java.util.*;

public class Main {
    static int arr[];
    static int N,M;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visited = new boolean[N+1];
        dfs( 0);
    }
    static void dfs(int count) {
        if (count == M) {
            for(int i: arr){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(int i=1; i<=N; i++){
            if(!visited[i]){
                arr[count] = i;
                visited[i] = true;
                dfs(count+1);
                visited[i] = false;
            }
        }
    }
}