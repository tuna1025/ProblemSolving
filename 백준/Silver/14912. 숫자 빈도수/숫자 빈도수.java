import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        char m = st.nextToken().charAt(0);
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String s = Integer.toString(i);
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == m) cnt++;
            }
        }
        System.out.println(cnt);
    }
}