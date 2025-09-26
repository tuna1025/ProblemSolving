import java.io.*;
import java.util.*;

public class Main {
    static class Problem implements Comparable<Problem> {
        int d, idx;
        Problem(int d, int idx) {
            this.d = d;
            this.idx = idx;
        }
        public int compareTo(Problem o) {
            return this.d - o.d;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken()); // freeze
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Problem[] arr = new Problem[N];
        for (int i = 0; i < N; i++) {
            arr[i] = new Problem(Integer.parseInt(st.nextToken()), i + 1);
        }

        Arrays.sort(arr);

        List<Integer> result = new ArrayList<>();
        int usedFreeze = 0;
        int day = 0;

        for (Problem p : arr) {
            // 이 문제를 시작 → d-1일 동안 freeze 필요
            int needFreeze = p.d - 1;
            for (int i = 0; i < needFreeze; i++) {
                if (day >= K) break;
                if (usedFreeze >= M) {
                    System.out.println(-1);
                    return;
                }
                result.add(0);
                usedFreeze++;
                day++;
            }
            if (day >= K) break;

            // 제출하는 날
            result.add(p.idx);
            day++;
            if (day >= K) break;
        }

        // 아직 K일 못 채웠으면 freeze로 채우기
        while (day < K) {
            if (usedFreeze >= M) {
                System.out.println(-1);
                return;
            }
            result.add(0);
            usedFreeze++;
            day++;
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int x : result) sb.append(x).append(" ");
        System.out.println(sb.toString().trim());
    }
}
