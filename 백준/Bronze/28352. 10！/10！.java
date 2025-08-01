import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int week = 604800; //1주에서의 초
        long fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        System.out.println(fac/ week);
    }
}
