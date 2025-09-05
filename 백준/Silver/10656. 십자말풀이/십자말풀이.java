import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] grid = new char[N][M];
        int[][] numbering = new int[N][M];
        List<int[]> hints = new ArrayList<>();
        int num = 1;

        // 격자 입력
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            grid[i] = line.toCharArray();
        }

        // 힌트 시작점 판별 및 번호 매기기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (grid[i][j] == '.') {
                    boolean isAcross = (j == 0 || grid[i][j - 1] == '#') &&
                            (j + 2 < M && grid[i][j + 1] == '.' && grid[i][j + 2] == '.'); // 가로로 이어지나?

                    boolean isDown = (i == 0 || grid[i - 1][j] == '#') &&
                            (i + 2 < N && grid[i + 1][j] == '.' && grid[i + 2][j] == '.'); // 세로로 이어지나?

                    if (isAcross || isDown) {
                        numbering[i][j] = num; // 퍼즐 전체 
                        hints.add(new int[]{i + 1, j + 1}); // 힌트 좌표
                        num++;
                    }
                }
            }
        }

        // 출력
        System.out.println(hints.size());
        for (int[] pos : hints) {
            System.out.println(pos[0] + " " + pos[1]);
        }
    }
}