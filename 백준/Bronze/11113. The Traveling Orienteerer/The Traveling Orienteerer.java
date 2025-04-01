import java.io.*;
import java.util.*;
import java.lang.Math; // Math 라이브러리 포함

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N 입력
        int N = Integer.parseInt(br.readLine());

        // 좌표를 저장할 리스트 생성
        List<double[]> coordinates = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            coordinates.add(new double[]{x, y});
        }

        // M 입력
        int M = Integer.parseInt(br.readLine());

        while (M-- > 0) {
            // K 입력
            int K = Integer.parseInt(br.readLine());

            // 경로를 저장할 리스트 생성
            int[] path = new int[K];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < K; i++) {
                path[i] = Integer.parseInt(st.nextToken());
            }

            // 총 거리 계산
            double totalDistance = 0.0;
            for (int i = 1; i < K; i++) {
                double x1 = coordinates.get(path[i - 1])[0];
                double y1 = coordinates.get(path[i - 1])[1];
                double x2 = coordinates.get(path[i])[0];
                double y2 = coordinates.get(path[i])[1];

                totalDistance += Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
            }

            // 결과 출력 (소수 첫째 자리에서 반올림)
            System.out.println(Math.round(totalDistance));
        }
    }
}