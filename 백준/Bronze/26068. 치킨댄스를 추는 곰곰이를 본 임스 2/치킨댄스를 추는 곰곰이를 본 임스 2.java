import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(),"-");
            st.nextToken();
            int days = Integer.parseInt(st.nextToken());
            if(days <= 90) cnt++;
        }
        System.out.println(cnt);
        br.close();
    }
}
