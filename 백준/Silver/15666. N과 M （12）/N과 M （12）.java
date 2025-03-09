import java.util.*;
import java.io.*;

public class Main {
    static int N, M; // 입력 받을 수의 개수와 수열의 한 개의 개수를 저장할 변수
    static int[] arr; // 입력 받은 숫자들을 저장할 배열
    static int[] res; // 수열을 저장할 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(st.nextToken()); // 입력 받을 수의 개수 N
        M = Integer.parseInt(st.nextToken()); // 수열 한 개의 개수 M
        arr = new int[N]; // 입력 받을 수의 개수만큼 배열 초기화
        res = new int[M]; // 수열 한 개의 개수만큼 배열 초기화
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 입력 받은 숫자들을 배열에 저장
        }
        Arrays.sort(arr); // 숫자들을 오름차순으로 정렬
        dfs(0, 0); // 깊이 우선 탐색 시작

        br.close(); // BufferedReader 닫기
    }

    static void dfs(int start, int count) {
        if (count == M) { // 수열의 길이가 M이면
            for (int i : res) {
                System.out.print(i + " "); // 수열 출력
            }
            System.out.println();
            return;
        }

        int beforeNum = 0; // 이전 숫자를 저장할 변수
        for (int i = start; i < N; i++) {
            if (beforeNum == arr[i]) continue; // 중복 숫자 건너뛰기
            beforeNum = arr[i]; // 이전 숫자를 현재 숫자로 업데이트
            res[count] = arr[i]; // 수열에 현재 숫자 저장
            dfs(i, count + 1); // 다음 단계로 깊이 우선 탐색 계속
        }
    }
}
