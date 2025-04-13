import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cnt = 0;
        for (int i = 0; i < s.length()/2; i++) {
            cnt += s.charAt(i) != s.charAt(s.length()-i-1) ? 1 : 0;
        }
        System.out.println(cnt);
    }
}