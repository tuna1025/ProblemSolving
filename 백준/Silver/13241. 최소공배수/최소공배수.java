import java.io.*;
import java.util.*;


class Main {
    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        long a = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long a2 = a;
        long b2 = b;
        while (b != 0) {
            long r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a2*b2/a);

        br.close();
    }
}
