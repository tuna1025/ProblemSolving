import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int totalScore = a + b + c;
            if(totalScore >= 55 && a >= 11 && b >= 8 && c >= 12) System.out.println(S+" "+totalScore+" "+"PASS");
            else System.out.println(S+" "+totalScore+" "+"FAIL");
        }
    }
}