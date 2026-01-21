import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long h1 = Long.parseLong(st.nextToken());
        long h2 = Long.parseLong(st.nextToken());
        long h3 = Long.parseLong(st.nextToken());
        long n = Long.parseLong(br.readLine());
        
        //정방향 -> 몸통 머리 꼭지 = h3 h2 h1
        //역방향 -> 꼭지 머리 몸통 = h1 h2 h3
        //1층 -> h3 h2 h1
        //2층 -> h3 몸통만 나옴
        //3충 -> h3 h2 h1 => 3층까지 3h3 2h2 2h1
        long totalHeight = (n * h3) + ((n + 1) / 2 * h2);

        if (n % 2 == 1) {
            totalHeight += h1;
        }

        System.out.println(totalHeight);

    }
}
