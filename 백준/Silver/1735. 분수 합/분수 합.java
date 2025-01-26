import java.io.*;
import java.math.BigInteger;
import java.util.*;


class Main {
    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int top = b*c + a*d;
        int bottom = b*d;
        BigInteger up = new BigInteger(String.valueOf(top));
        BigInteger down = new BigInteger(String.valueOf(bottom));
        BigInteger gcd = up.gcd(down);
        int gcdInt = gcd.intValue();

        System.out.print(top/gcdInt + " " + bottom/gcdInt);
        br.close();
    }
}
