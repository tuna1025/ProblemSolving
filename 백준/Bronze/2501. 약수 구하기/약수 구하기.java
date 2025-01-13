import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int cnt = 1;
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                if(cnt == k) {
                    System.out.println(n/i);
                }
                cnt++;
            }
        }
        if (cnt<=k) System.out.println(0);
        br.close();
    }
}