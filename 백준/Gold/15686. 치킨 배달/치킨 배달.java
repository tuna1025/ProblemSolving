import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[] visited;
    static int N,M;
    static ArrayList<Point> chiken;
    static ArrayList<Point> home;
    static int ans = Integer.MAX_VALUE; // 도시의 치킨 거리의 최솟값 저장

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // NxN의 거리 크기
        M = Integer.parseInt(st.nextToken()); // 남겨야할 치킨집의 수의 최대치
        map = new int[N][N];
        chiken = new ArrayList<>();
        home = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) home.add(new Point(i, j)); // 가정집 좌표를 저장
                else if (map[i][j] == 2) chiken.add(new Point(i, j)); // 치킨집 좌표를 저장
            }
        }// 지도하고 치킨집 가정집 입력받기
        // 도시의 치킨거리 = 집과 근처 치킨집과의 거리의합
        // 치킨집 때려부수고 경우의 수를 탐색 해야하니 브루트포스 + 경로 탐색?백트래킹?
        visited = new boolean[chiken.size()]; // 치킨집 방문 여부를 저장
        dfs(0,0); // DFS 탐색 시작
        System.out.println(ans); // 최소 치킨 거리 출력
        br.close();
    }

    static void dfs(int start, int cnt) {
        if (cnt == M) { // 조건: M개의 치킨집이 선택되었을 때
            int result = 0;

            for (int i = 0; i < home.size(); i++) { // 각 집에 대해 치킨 거리 계산
                int temp = Integer.MAX_VALUE;

                for (int j = 0; j < chiken.size(); j++) {
                    if(visited[j]){ // 선택된 치킨집만 거리 계산
                        int dist = Math.abs(home.get(i).x - chiken.get(j).x)
                                + Math.abs(home.get(i).y - chiken.get(j).y);
                        temp = Math.min(temp, dist); // 집의 최소 치킨 거리 저장
                    }
                }
                result += temp; // 총 치킨 거리에 더하기
            }
            ans = Math.min(ans, result); // 최솟값 갱신
            return;
        }

        for (int i = start; i < chiken.size(); i++) {
            visited[i] = true; // 현재 치킨집 선택
            dfs(i + 1, cnt + 1); // 다음 단계로 이동
            visited[i] = false; // 선택 복구
        }
    }
}

// 좌표 클래스
class Point{
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
