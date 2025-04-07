import java.io.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cost = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        if(money - cost * n>0) System.out.println(0);
        else System.out.println(Math.abs(cost*n - money));
    }
}