import java.util.*;
import java.io.*;

public class Main {
    static int N, M; // 수의 개수와 수열의 길이를 저장하는 변수
    static int[] arr; // 입력받은 수를 저장하는 배열
    static int[] res; // 수열을 저장하는 배열
    static boolean[] visited; // 방문 여부를 체크하는 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받기 위한 BufferedReader
        StringTokenizer st = new StringTokenizer(br.readLine()); // 첫 번째 줄의 입력을 공백으로 구분하여 읽어옴
        StringBuilder sb = new StringBuilder(); // 결과 출력을 위한 StringBuilder
        N = Integer.parseInt(st.nextToken()); // 입력 받을 수의 개수
        M = Integer.parseInt(st.nextToken()); // 수열의 길이
        arr = new int[N]; // 입력받은 수를 저장할 배열 초기화
        res = new int[M]; // 수열을 저장할 배열 초기화
        visited = new boolean[N]; // 방문 여부를 체크할 배열 초기화

        st = new StringTokenizer(br.readLine()); // 두 번째 줄의 입력을 공백으로 구분하여 읽어옴
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 입력받은 수를 배열에 저장
        }
        Arrays.sort(arr); // 배열을 오름차순으로 정렬
        dfs(0); // DFS 탐색 시작

        br.close(); // BufferedReader 닫기
    }

    static void dfs(int count) {
        if (count == M) { // 수열의 길이가 M에 도달하면
            for(int i : res) {
                System.out.print(i + " "); // 수열 출력
            }
            System.out.println(); // 줄 바꿈
            return; // 함수 종료
        }

        int beforeNum = 0; // 이전 숫자를 저장할 변수
        for (int i = 0; i < N; i++) {
            if (!visited[i]) { // 방문하지 않은 숫자에 대해
                if(beforeNum == arr[i]) continue; // 중복 숫자는 건너뜀

                visited[i] = true; // 방문 체크
                beforeNum = arr[i]; // 이전 숫자 업데이트
                res[count] = arr[i]; // 수열에 숫자 추가
                dfs(count + 1); // 다음 숫자 탐색
                visited[i] = false; // 방문 해제
            }
        }
    }
}
