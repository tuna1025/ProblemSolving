import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] arr = {'a','i','u','e','o'};
        int cnt = 0;
        for(char c : arr) {
            for(int j = 0; j < n; j++) {
                if(c == s.charAt(j)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}