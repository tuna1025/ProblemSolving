import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int d1 = Math.abs(a - b);
            int d2 = Math.abs(b - c);
            if (d1 > d2) {
                System.out.println(d1-1);
            }
            else {
                System.out.println(d2-1);
            }
        }
        br.close();
    }
}