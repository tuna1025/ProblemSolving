import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while (N-- > 0) {
            String s = br.readLine();
            sb.append((s.charAt(s.length()-1) - '0') % 2 == 0 ? "even\n" : "odd\n");

        }
        System.out.println(sb.toString());
    }
}