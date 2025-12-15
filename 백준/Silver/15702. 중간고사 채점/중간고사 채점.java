import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 문제 수
        int M = Integer.parseInt(st.nextToken()); // 응시자 수

        int[] score = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }

        int maxScore = -1;
        int bestId = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int id = Integer.parseInt(st.nextToken());
            int sum = 0;

            for (int j = 0; j < N; j++) {
                String result = st.nextToken();
                if (result.equals("O")) {
                    sum += score[j];
                }
            }

            if (sum > maxScore || (sum == maxScore && id < bestId)) {
                maxScore = sum;
                bestId = id;
            }
        }

        System.out.println(bestId + " " + maxScore);
    }
}
