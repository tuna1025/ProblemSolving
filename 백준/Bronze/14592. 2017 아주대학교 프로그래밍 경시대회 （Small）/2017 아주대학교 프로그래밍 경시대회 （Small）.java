import java.util.*;

public class Main {
    static class Player {
        int idx, S, C, L;

        Player(int idx, int S, int C, int L) {
            this.idx = idx;
            this.S = S;
            this.C = C;
            this.L = L;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        List<Player> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int S = sc.nextInt();
            int C = sc.nextInt();
            int L = sc.nextInt();
            list.add(new Player(i, S, C, L));
        }

        // 정렬 기준: S 내림차순 → C 오름차순 → L 오름차순
        list.sort((a, b) -> {
            if (a.S != b.S) return b.S - a.S;      // 점수 내림차순
            if (a.C != b.C) return a.C - b.C;      // 제출 횟수 오름차순
            return a.L - b.L;                      // 업로드 시간 오름차순
        });

        // 1등의 번호 출력
        System.out.println(list.get(0).idx);
    }
}
