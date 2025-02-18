import java.io.*;
import java.util.*;

class Main {
    static int N, M; // 상자의 가로, 세로 크기를 저장하는 변수
    static int[][] box; // 상자 배열
    static int[] dx = new int[]{1, 0, -1, 0}; // 상하좌우 이동을 위한 배열
    static int[] dy = new int[]{0, 1, 0, -1}; // 상하좌우 이동을 위한 배열
    static LinkedList<int[]> queue = new LinkedList<>(); // BFS 탐색을 위한 큐

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); // 가로 크기
        N = Integer.parseInt(st.nextToken()); // 세로 크기
        box = new int[N][M]; // 상자 배열 초기화

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken()); // 상자의 상태 입력
                if (box[i][j] == 1) {
                    queue.add(new int[]{i, j}); // 익은 토마토 위치를 큐에 추가
                }
            }
        }

        System.out.println(bfs() - 1); // 익은 토마토가 1이므로 1이 크게 나와 1빼기
        br.close();
    }

    static int bfs() {
        while (!queue.isEmpty()) {
            int[] d = queue.poll(); // 큐에서 현재 위치를 꺼냄
            for (int i = 0; i < 4; i++) {
                int nx = d[0] + dx[i]; // 상하좌우로 이동한 새로운 x좌표
                int ny = d[1] + dy[i]; // 상하좌우로 이동한 새로운 y좌표

                if (nx >= 0 && nx < N && ny >= 0 && ny < M && box[nx][ny] == 0) {
                    queue.add(new int[]{nx, ny}); // 새로운 위치를 큐에 추가
                    box[nx][ny] = box[d[0]][d[1]] + 1; // 토마토가 익는 시간을 갱신
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    return 0; // 익지 않은 토마토가 있으면 0 반환
                }
                cnt = Math.max(box[i][j], cnt); // 최대 일수를 갱신
            }
        }

        return cnt; // 최대 일수 반환
    }
}
