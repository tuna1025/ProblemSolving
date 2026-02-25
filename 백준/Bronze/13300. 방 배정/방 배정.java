import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // [성별][학년]
        int[][] arr = new int[2][7]; // 학년은 1~6 사용

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            arr[S][Y]++;
        }

        int result = 0;

        for (int s = 0; s < 2; s++) {
            for (int y = 1; y <= 6; y++) {
                if (arr[s][y] > 0) {
                    result += (arr[s][y] + K - 1) / K;
                }
            }
        }

        System.out.println(result);
    }
}