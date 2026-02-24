import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());   // 플레이어 수 입력
        int[] vote = new int[N + 1];               // 각 플레이어의 득표 수 저장

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 각 플레이어의 투표 결과 처리
        while (st.hasMoreTokens()) {
            int x = Integer.parseInt(st.nextToken());

            if (x != 0) {
                vote[x]++;
            }
        }

        int max = 0;      // 최다 득표 수
        int idx = 0;      // 최다 득표자 번호
        int count = 0;    // 최다 득표자를 가진 사람 수

        // 각 플레이어의 득표 수 확인
        for (int i = 1; i <= N; i++) {
            if (vote[i] > max) {   // 더 큰 득표 수 발견
                max = vote[i];     // 최다 득표 수 갱신
                idx = i;           // 해당 플레이어 번호 저장
                count = 1;         // 새로운 최다 득표자가 나오면 1로 초기화,
            }
            else if (vote[i] == max && max > 0) {
                count++;           // 공동 1등인 경우 수 증가
            }
        }

        // 최다 득표자가 1명이면 출력, 아니면 skipped
        if (count == 1) {
            System.out.println(idx);
        } else {
            System.out.println("skipped");
        }
    }
}