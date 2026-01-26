import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long a = Long.parseLong(st.nextToken());
        long K = Long.parseLong(st.nextToken());

        long other = a - K;

        long maxRank = Math.min(N - 1, other) + 1;
        long minRank = (other + M - 1) / M + 1;

        System.out.println(maxRank + " " + minRank);
    }
}