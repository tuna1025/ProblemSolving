import java.io.*;
import java.util.*;

public class Main {
    // 게임 보드를 나타내는 배열
    static int[] board = new int[101];
    // 방문 여부 및 주사위 굴림 횟수를 나타내는 배열
    static int[] visited = new int[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 사다리와 뱀의 개수 입력받기
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 보드 초기화 (1부터 100까지)
        for (int i = 1; i <= 100; i++) {
            board[i] = i;
        }

        // 사다리 정보 입력받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x] = y;
        }

        // 뱀 정보 입력받기
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x] = y;
        }

        // BFS 탐색 시작
        bfs();

        // 결과 출력 (100번 칸에 도달하는 데 필요한 주사위 굴림 횟수)
        System.out.println(visited[100]);
    }

    static void bfs(){
        Queue<Integer> q = new LinkedList<>();
        q.add(1); // 1번 칸에서 시작
        visited[1] = 0;

        while(!q.isEmpty()){
            int index = q.poll();

            // 주사위를 굴려서 나올 수 있는 모든 경우 탐색
            for(int i = 1; i <= 6; i++){
                int next = index + i; // 나온 주사위 수 만큼 갱신
                if(next > 100) continue; // 100번 칸을 넘어가면 무시

                // 아직 방문하지 않은 칸이면 큐에 추가하고 방문 처리
                if(visited[board[next]] == 0){
                    q.add(board[next]);
                    visited[board[next]] = visited[index] + 1; // 방문한 횟수 갱신
                }
            }
        }
    }
}
