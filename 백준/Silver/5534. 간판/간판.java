import java.io.*;
import java.util.*;

public class Main {
    static String target;
    static int tLen;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        target = br.readLine().trim();
        tLen = target.length();

        int result = 0;
        for (int i = 0; i < N; i++) {
            String word = br.readLine().trim();
            result += check(word);
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

    static int check(String str) {
        int sLen = str.length();

        for (int sIdx = 0; sIdx < sLen; sIdx++) {
            if (str.charAt(sIdx) == target.charAt(0)) {
                for (int eIdx = sIdx; eIdx < sLen; eIdx++) {
                    if (str.charAt(eIdx) == target.charAt(tLen - 1)) {
                        int dist = (eIdx - sIdx) / (tLen - 1);
                        if ((eIdx - sIdx) % (tLen - 1) != 0) continue;

                        int cnt = 0;
                        while (cnt < tLen) {
                            if (sIdx + dist * cnt >= sLen) break;
                            if (str.charAt(sIdx + dist * cnt) == target.charAt(cnt)) {
                                cnt++;
                                continue;
                            }
                            break;
                        }
                        if (cnt == tLen) return 1;
                    }
                }
            }
        }

        return 0;
    }
}
