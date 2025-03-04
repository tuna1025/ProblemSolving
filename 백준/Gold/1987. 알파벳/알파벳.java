import java.io.*;
import java.util.*;

public class Main {
    static int R, C; // 행, 열, 카운트 변수
    static char[][] board; // 보드 배열
    static boolean[] visited;// 방문 여부 확인 배열
    static int[] dx = {0, 0, -1, 1}; // x 방향 이동 배열
    static int[] dy = {-1, 1, 0, 0}; // y 방향 이동 배열
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken()); // 행 입력
        C = Integer.parseInt(st.nextToken()); // 열 입력
        board = new char[R][C]; // 보드 배열 초기화
        visited = new boolean[26]; // 방문 여부 확인 배열 초기화

        for (int i = 0; i < R; i++) { // 보드 데이터 입력
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = s.charAt(j); // 각 칸에 문자 저장
            }
        }
        dfs(0, 0, 0); // DFS 탐색 시작
        if (R == 1&&C == 1) cnt++;
        System.out.println(cnt); // 결과 출력

    }

    static void dfs(int x, int y, int count) {
        if(visited[board[x][y]-'A']) {
            cnt = Math.max(cnt, count);
            return;
        }
        visited[board[x][y]-'A'] = true;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=R || ny>=C || nx<0 || ny<0) continue;
            dfs(nx, ny, count+1);
        }
        visited[board[x][y]-'A'] = false;
    }
}
