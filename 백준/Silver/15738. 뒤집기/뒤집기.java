import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 배열 값은 필요 없음 (위치만 추적)
        br.readLine(); // A 배열 한 줄 스킵

        int pos = K;

        for (int m = 0; m < M; m++) {
            int i = Integer.parseInt(br.readLine());

            if (i > 0) {
                // 앞에서 i개 뒤집기
                if (pos <= i) {
                    pos = i - pos + 1;
                }
            } else {
                // 뒤에서 -i개 뒤집기
                int len = -i;
                int start = N - len + 1;
                if (pos >= start) {
                    pos = start + (N - pos);
                }
            }
        }

        System.out.println(pos);
    }
}
