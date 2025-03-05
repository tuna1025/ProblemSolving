import java.util.*;
import java.io.*;

public class Main {
    static int N,M;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        dfs(1,0);
    }

    static void dfs(int start, int count) {
        if (count == M) {
            for(int i:arr){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        for(int i=start; i<=N; i++){
            arr[count] = i;
            dfs(i, count+1);
        }
    }
}
