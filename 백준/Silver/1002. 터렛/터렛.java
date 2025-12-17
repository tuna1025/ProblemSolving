import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int distancePow =
                    (x2 - x1) * (x2 - x1)
                  + (y2 - y1) * (y2 - y1);

            int result;

            // case 1: 두 원이 완전히 같은 경우
            if (x1 == x2 && y1 == y2 && r1 == r2) {
                result = -1;
            }
            // case 2-1: 서로 멀리 떨어져 있을 때
            else if (distancePow > (r1 + r2) * (r1 + r2)) {
                result = 0;
            }
            // case 2-2: 한 원 안에 다른 원이 있으나 접하지 않을 때
            else if (distancePow < (r2 - r1) * (r2 - r1)) {
                result = 0;
            }
            // case 3-1: 내접
            else if (distancePow == (r2 - r1) * (r2 - r1)) {
                result = 1;
            }
            // case 3-2: 외접
            else if (distancePow == (r1 + r2) * (r1 + r2)) {
                result = 1;
            }
            // case 4: 두 점에서 만남
            else {
                result = 2;
            }

            sb.append(result).append('\n');
        }

        System.out.print(sb);
    }
}
