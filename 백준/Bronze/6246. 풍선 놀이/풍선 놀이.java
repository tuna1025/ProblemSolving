import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());
       int[] slots = new int[n+1];
       for (int i = 0; i < m; i++) {
           st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
           for (int j = a; j < slots.length; j += b) {
               slots[j]++;
           }
       }
       int cnt = 0;
       for (int i: slots) {
           if (i == 0) cnt++;
       }
       System.out.println(cnt-1);

    }
}
