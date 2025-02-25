import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine()); //테스트 케이스 수
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(bfs(a, b)).append("\n");
        }
        System.out.println(sb);
    }

    static String bfs(int a, int b) {
        Queue<Integer> q = new LinkedList<>(); // BFS를 위한 큐
        boolean[] visited = new boolean[10000]; // 방문 여부를 체크하기 위한 배열
        String[] res = new String[10000]; // 명령어 저장 배열
        Arrays.fill(res, ""); // 초기화 하지 않으면 null값이 존재하고 이 칸에는 NullPointerException이 발생해 문자열 추가안됨

        q.add(a); // 시작 숫자를 큐에 추가
        visited[a] = true; // 시작 숫자를 방문 처리

        while (!q.isEmpty()) {
            int cur = q.poll(); // 현재 숫자를 큐에서 꺼냄

            int D = (cur * 2) % 10000; // 현재 숫자를 두 배로 바꾸고 10000보다 크면 나머지
            if (!visited[D]) {
                q.add(D);
                visited[D] = true;
                res[D] = res[cur] + "D"; // 명령어 추가
            }

            int S = cur == 0 ? 9999 : cur - 1; // 현재 숫자에서 1을 빼고, 현재 숫자가 0이면 9999
            if (!visited[S]) {
                q.add(S);
                visited[S] = true;
                res[S] = res[cur] + "S"; // 명령어 추가
            }

            int L = cur / 1000 + (cur % 1000) * 10; // 왼쪽으로 회전, 왼편부터 d2, d3, d4, d1
            if (!visited[L]) {
                q.add(L);
                visited[L] = true;
                res[L] = res[cur] + "L"; // 명령어 추가
            }

            int R = (cur % 10) * 1000 + cur / 10; // 오른쪽으로 회전, 왼편부터 d4, d1, d2, d3
            if (!visited[R]) {
                q.add(R);
                visited[R] = true;
                res[R] = res[cur] + "R"; // 명령어 추가
            }
        }
        return res[b]; // 목표 숫자에 도달했을 때 명령어 반환
    }
}
