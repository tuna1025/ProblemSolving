import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] RGB = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            RGB[i][0] = Integer.parseInt(st.nextToken()); // red
            RGB[i][1] = Integer.parseInt(st.nextToken()); // green
            RGB[i][2] = Integer.parseInt(st.nextToken()); // blue
        }

        for (int i = 1; i < N; i++) {
            RGB[i][0] += Math.min(RGB[i-1][2], RGB[i-1][1]);
            RGB[i][1] += Math.min(RGB[i-1][2], RGB[i-1][0]);
            RGB[i][2] += Math.min(RGB[i-1][1], RGB[i-1][0]);
        }// 각 색깔별로 이전 색상과 다른 경우를 누적합

        System.out.println(Math.min(RGB[N-1][0], Math.min(RGB[N-1][1], RGB[N-1][2])));
    }
}