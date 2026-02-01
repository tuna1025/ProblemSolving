import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 시작 시간: 11월 11일 11:11
        int start = 11 * 60 + 11;

        // 종료 시간을 분 단위로 변환
        int end = (D - 11) * 24 * 60 + H * 60 + M;

        int result = end - start;

        if (result < 0) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }
}