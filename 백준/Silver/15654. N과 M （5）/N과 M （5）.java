import java.io.*;
import java.util.*;

class Main {
    static int N, M; // N: 배열의 크기, M: 선택할 숫자의 개수
    static int[] arr; // 입력받을 숫자들을 저장할 배열
    static int[] temp; // 선택한 숫자들을 저장할 배열
    static boolean[] visited; // 숫자의 선택 여부를 체크할 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 배열의 크기를 입력받음
        M = Integer.parseInt(st.nextToken()); // 선택할 숫자의 개수를 입력받음
        st = new StringTokenizer(br.readLine());
        arr = new int[N]; // 숫자들을 저장할 배열 초기화
        visited = new boolean[N]; // 방문 여부를 체크할 배열 초기화
        temp = new int[M]; // 선택한 숫자들을 저장할 배열 초기화
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 숫자들을 배열에 저장
        }
        Arrays.sort(arr); // 숫자들을 오름차순으로 정렬
        dfs(0); // 깊이 우선 탐색 시작
        br.close();
    }

    static void dfs(int count) {
        if (count == M) { // 선택한 숫자의 개수가 M개가 되면
            for (int i : temp) {
                System.out.print(i + " "); // 선택한 숫자들을 출력
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) { // 방문하지 않은 숫자라면
                visited[i] = true; // 방문 체크
                temp[count] = arr[i]; // 숫자를 선택
                dfs(count + 1); // 다음 숫자 선택을 위해 재귀 호출
                visited[i] = false; // 방문 체크 해제
            }
        }
    }
}
