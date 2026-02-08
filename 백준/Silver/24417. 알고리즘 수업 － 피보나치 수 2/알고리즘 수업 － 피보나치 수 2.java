import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int fir = 1;
        int sec = 1;
        int res = 0;
        int MOD = 1000000007;

        //n 최소값이 5이기 때문에 n=1,2인 경우는 제외
        for(int i = 3; i <= n; i++) {
            res = (fir + sec) % MOD;
            fir = sec;
            sec = res;
        }
        System.out.println(res+" "+ (n-2));

    }
}