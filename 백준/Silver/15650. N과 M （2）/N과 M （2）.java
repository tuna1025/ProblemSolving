import java.io.*;
import java.util.*;

public class Main {
    static int[] arr; // 수열을 저장할 배열
    static int N, M; // N과 M 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 1~N 사이에서
        M = Integer.parseInt(st.nextToken()); // M개의 수열을 고름
        arr = new int[M]; // 배열 크기를 M으로 설정
        dfs(1, 0); // DFS 탐색 시작
    }

    static void dfs(int start, int count) {
        if (count == M) { // 배열을 가득 채우면 = 수열을 M개만큼 채우면 한 줄 출력 후 종료
            for (int i : arr) {
                System.out.print(i + " "); // 배열의 값을 출력
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) { // start부터 N까지 반복
            arr[count] = i; // 배열에 값 저장
            dfs(i + 1, count + 1); // DFS 재귀 호출, 다음 값을 위해 i + 1 전달
        }
    }
}
