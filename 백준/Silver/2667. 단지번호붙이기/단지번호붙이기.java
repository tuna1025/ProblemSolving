import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int N; // 그래프의 크기
    static int[] dx = new int[]{0, 0, -1, 1}; // 상하좌우 이동을 위한 배열
    static int[] dy = new int[]{1, -1, 0, 0}; // 상하좌우 이동을 위한 배열
    static boolean[][] visited; // 방문 여부를 체크하는 배열
    static int[][] map; // 그래프를 저장하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine()); // 그래프의 크기 입력받기
        map = new int[N][N]; // 그래프 초기화
        visited = new boolean[N][N]; // 방문 여부 배열 초기화
        int houseCnt = 0; // 집의 개수를 세는 변수

        // 그래프 입력
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j) - '0'; // 문자로 입력받은 값을 정수로 변환하여 그래프에 저장
            }
        }

        ArrayList<Integer> list = new ArrayList<>(); // 각 단지의 집의 수를 저장할 리스트
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && map[i][j] == 1) { // 방문하지 않았고 집이 있는 경우
                    list.add(bfs(i, j)); // BFS를 수행하여 단지의 집의 수를 리스트에 추가
                    houseCnt++; // 단지의 수 증가
                }
            }
        }

        Collections.sort(list); // 단지 내 집의 수를 오름차순으로 정렬
        for (int i : list) {
            sb.append(i).append("\n"); // 각 단지의 집의 수를 결과 문자열에 추가
        }
        System.out.println(houseCnt); // 총 단지의 수 출력
        System.out.println(sb); // 각 단지의 집의 수 출력
        br.close();
    }

    // BFS를 수행하여 단지 내 집의 수를 세는 함수
    static int bfs(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        visited[i][j] = true; // 시작 지점을 방문 처리
        int cnt = 1; // 시작 지점을 포함하여 집의 수 1로 초기화
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int k = 0; k < 4; k++) { // 상하좌우로 이동
                int x = cur[0] + dx[k];
                int y = cur[1] + dy[k];
                if (x >= 0 && x < N && y >= 0 && y < N && !visited[x][y] && map[x][y] == 1) { // 유효 범위 내에 있으며, 방문하지 않았고, 집이 있는 경우
                    visited[x][y] = true; // 방문 처리
                    q.add(new int[]{x, y}); // 큐에 추가
                    cnt++; // 집의 수 증가
                }
            }
        }
        return cnt; // 단지 내 집의 수 반환
    }
}
