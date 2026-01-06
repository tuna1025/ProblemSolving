import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String cmd = br.readLine();

        int[][] trace = new int[N][N];

        int r = 0, c = 0; // 시작 위치

        for (char ch : cmd.toCharArray()) {
            int nr = r, nc = c;

            if (ch == 'U') nr--;
            else if (ch == 'D') nr++;
            else if (ch == 'L') nc--;
            else if (ch == 'R') nc++;

            // 격자 밖이면 무시
            if (nr < 0 || nr >= N || nc < 0 || nc >= N) continue;

            // 수직 이동
            if (r != nr) {
                trace[r][c] |= 1;
                trace[nr][nc] |= 1;
            }
            // 수평 이동
            if (c != nc) {
                trace[r][c] |= 2;
                trace[nr][nc] |= 2;
            }

            r = nr;
            c = nc;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (trace[i][j] == 0) sb.append('.');
                else if (trace[i][j] == 1) sb.append('|');
                else if (trace[i][j] == 2) sb.append('-');
                else sb.append('+');
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}
