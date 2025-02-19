import java.io.*;
import java.util.*;

class Main {
    static int N, M, H; // 상자의 가로, 세로 크기를 저장하는 변수
    static int[][][] box; // 상자 배열
    static int[] dx = new int[]{1, 0, -1, 0, 0, 0}; // 상하좌우 이동을 위한 배열
    static int[] dy = new int[]{0, 1, 0, -1, 0, 0}; // 상하좌우 이동을 위한 배열
    static int[] dz = new int[]{0, 0, 0, 0, 1, -1}; // 위아래 이동을 위한 배열
    static LinkedList<int[]> queue = new LinkedList<>(); // BFS 탐색을 위한 큐

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); // 가로 크기
        N = Integer.parseInt(st.nextToken()); // 세로 크기
        H = Integer.parseInt(st.nextToken()); // 높이
        box = new int[H][N][M]; // 상자 배열 초기화

        // 상자 입력 받으며 익은 토마토 위치 찾기
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < M; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if (box[i][j][k] == 1) queue.add(new int[]{i, j, k}); // 익은 토마토 위치 큐에 추가
                }
            }
        }

        System.out.println(bfs() - 1); // 익은 토마토가 1이므로 1을 빼고 출력
        br.close();
    }

    static int bfs() {
        // BFS 탐색
        while (!queue.isEmpty()) {
            int[] cur = queue.poll(); // 큐에서 현재 위치를 꺼내옴

            // 6방향 탐색
            for (int i = 0; i < 6; i++) {
                int nx = cur[1] + dx[i];
                int ny = cur[2] + dy[i];
                int nz = cur[0] + dz[i];
                // 유효한 위치인지 확인 후, 익지 않은 토마토를 익힘
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && nz >= 0 && nz < H && box[nz][nx][ny] == 0) {
                    box[nz][nx][ny] = box[cur[0]][cur[1]][cur[2]] + 1;
                    queue.add(new int[]{nz, nx, ny}); // 새로운 위치 큐에 추가
                }
            }
        }

        int max = 0; // 최댓값 초기화
        // 상자 내 모든 위치를 확인하며 최댓값 계산
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[i][j][k] == 0) return 0; // 익지 않은 토마토가 있으면 0 반환
                    max = Math.max(box[i][j][k], max); // 최댓값 갱신
                }
            }
        }

        return max; // 최댓값 반환
    }
}
