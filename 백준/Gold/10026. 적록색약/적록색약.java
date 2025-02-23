import java.util.*;
import java.io.*;

class Main {
    static char[][] RGB; // 2차원 배열로 색상 그리드를 저장
    static boolean[][] visited; // 방문한 노드를 추적하는 2차원 배열
    static int[] dx = new int[]{-1, 0, 1, 0}; // 행 이동 배열 (위, 왼쪽, 아래, 오른쪽)
    static int[] dy = new int[]{0, -1, 0, 1}; // 열 이동 배열 (위, 왼쪽, 아래, 오른쪽)
    static int n; // 그리드의 크기
    static int cnt = 0; // 연결된 컴포넌트 개수를 세는 카운터

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine()); // 그리드의 크기를 입력받음
        RGB = new char[n][n]; // 색상 그리드를 초기화
        visited = new boolean[n][n]; // 방문 배열 초기화
        for (int i = 0; i < n; i++) { // 그리드 값을 입력받음
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                RGB[i][j] = s.charAt(j); // 색상을 그리드에 저장
            }
        }
        // 모든 색을 구분할 수 있는 사람의 연결된 컴포넌트 개수를 셈
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    cnt++; // 새로운 연결된 컴포넌트를 위한 카운터 증가
                    dfs(i, j); // 모든 연결된 노드를 표시하기 위해 DFS 수행
                }
            }
        }

        sb.append(cnt).append(" "); // 연결된 컴포넌트 개수를 결과에 추가
        for (int i = 0; i < n; i++) {
            Arrays.fill(visited[i], false); // 다음 단계로 이동하기 위해 방문 배열 초기화
        }
        cnt = 0; // 다음 단계를 위해 카운터 초기화

        // 적녹색약을 시뮬레이션하기 위해 모든 'R'을 'G'로 변환
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (RGB[i][j] == 'R') RGB[i][j] = 'G';
            }
        }

        // 적녹색약인 사람의 연결된 컴포넌트 개수를 셈
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j]) {
                    cnt++; // 새로운 연결된 컴포넌트를 위한 카운터 증가
                    dfs(i, j); // 모든 연결된 노드를 표시하기 위해 DFS 수행
                }
            }
        }
        sb.append(cnt); // 연결된 컴포넌트 개수를 결과에 추가
        System.out.println(sb); // 결과 출력

    }

    // 동일한 색상의 모든 연결된 노드를 표시하는 깊이 우선 탐색
    public static void dfs(int i, int j) {
        visited[i][j] = true; // 현재 노드를 방문했다고 표시
        char ch = RGB[i][j]; // 현재 노드의 색상을 가져옴
        for (int k = 0; k < 4; k++) { // 4개의 가능한 방향 탐색 (위, 왼쪽, 아래, 오른쪽)
            int nx = i + dx[k];
            int ny = j + dy[k];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n && !visited[nx][ny] && ch == RGB[nx][ny]) {
                dfs(nx, ny); // 다음 노드가 범위 내에 있고, 방문하지 않았으며, 동일한 색상일 때 DFS 계속 수행
            }
        }
    }
}
