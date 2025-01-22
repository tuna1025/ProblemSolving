import java.io.*;
import java.util.*;


class Main {
        public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int a2 = a;
            int b2 = b;
            while (b != 0) {
                int r = a % b;
                a = b;
                b = r;
            }
            System.out.println(a2*b2/a);
        }
        br.close();
        }
}

