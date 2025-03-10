import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // A를
        int B = Integer.parseInt(st.nextToken()); // B로 바꾸기

        // 2를 곱하거나, 1을 가장 오른쪽에 추가한다. 이진트리느낌?
        // 경로탐색을 사용해서 거기까지 가는 경로중 최단거리찾기
        System.out.println(bfs(A, B));
    }

    // BFS 메서드 정의
    static int bfs(int A, int B) {
        Queue<Integer> q = new LinkedList<>(); // 큐 생성
        int cnt = 0; // 레벨(깊이) 카운터 초기화
        q.add(A); // 시작 노드 A를 큐에 추가

        // 큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            int size = q.size(); // 현재 큐의 크기(현재 레벨의 노드 수)

            // 현재 레벨의 모든 노드에 대해 반복
            for (int i = 0; i < size; i++) {
                long temp = q.poll(); // 큐에서 노드를 하나 꺼냄

                // 목표 노드에 도달한 경우
                if (temp == B) {
                    return cnt + 1; // 현재 레벨 반환
                }

                // 2를 곱한 값이 B보다 작거나 같은 경우 큐에 추가
                if (temp * 2 <= B) q.add((int)temp * 2);

                // 1을 가장 오른쪽에 추가한 값이 B보다 작거나 같은 경우 큐에 추가
                if (temp * 10 + 1 <= B) q.add((int)temp * 10 + 1);
            }
            cnt++; // 레벨(깊이) 증가
        }

        // 목표 노드에 도달하지 못한 경우
        return -1;
    }
}
