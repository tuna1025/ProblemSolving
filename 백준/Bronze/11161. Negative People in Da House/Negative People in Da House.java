import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int M = Integer.parseInt(br.readLine());
            int minimumPeople = 0;
            int currentPeople = 0;

            for (int m = 0; m < M; m++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int P1 = Integer.parseInt(st.nextToken());
                int P2 = Integer.parseInt(st.nextToken());

                currentPeople += P1;
                currentPeople -= P2;

                if (currentPeople < minimumPeople) {
                    minimumPeople = currentPeople;
                }
            }

            sb.append(Math.abs(minimumPeople)).append("\n");
        }

        System.out.print(sb);
    }
}