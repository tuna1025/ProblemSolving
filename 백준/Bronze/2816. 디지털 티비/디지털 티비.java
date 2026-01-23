import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> channels = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            channels.add(br.readLine());
        }

        StringBuilder answer = new StringBuilder();
        int cursor = 0;

        // 1. KBS1을 맨 위로
        int idx1 = channels.indexOf("KBS1");

        // 커서를 KBS1 위치로 이동
        while (cursor < idx1) {
            answer.append("1");
            cursor++;
        }

        // KBS1을 위로 올리기
        while (idx1 > 0) {
            Collections.swap(channels, idx1, idx1 - 1);
            answer.append("4");
            idx1--;
            cursor--;
        }

        // 2. KBS2를 두 번째로
        int idx2 = channels.indexOf("KBS2");

        // 커서를 KBS2 위치로 이동
        while (cursor < idx2) {
            answer.append("1");
            cursor++;
        }

        // KBS2를 인덱스 1까지 올리기
        while (idx2 > 1) {
            Collections.swap(channels, idx2, idx2 - 1);
            answer.append("4");
            idx2--;
            cursor--;
        }

        System.out.println(answer);
    }
}
