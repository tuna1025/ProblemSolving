import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        int cnt = 0;
        for (int i = n-1 ; i >= 0 ; i--) {
            coin[i] = Integer.parseInt(br.readLine());
        }// 큰 수 부터 비교하기 위해 먼저 집어넣음

       while (k != 0) {
           for (int i = 0; i < n; i++) {
               if (k>= coin[i]) {
                   cnt++;
                   k -= coin[i];
                   break;
               }
           }
       }
       System.out.println(cnt);
       br.close();
    }
}