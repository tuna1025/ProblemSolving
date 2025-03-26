import java.util.*;
import java.io.*;

// 이게 어떻게 브론즈 2야 ㅅㅂ
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String P = br.readLine();

        System.out.println(kmp(S, P) ? 1 : 0);
    }

    public static boolean kmp(String text, String pattern) {
        int[] lps = computeLPSArray(pattern); // 부분 일치 테이블 생성
        int i = 0, j = 0; // i는 text, j는 pattern의 인덱스

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    return true; // 패턴을 찾음
                }
            } else if (j > 0) {
                j = lps[j - 1]; // 부분 일치 테이블을 참조하여 점프
            } else {
                i++;
            }
        }
        return false; // 패턴을 찾지 못함
    }

    public static int[] computeLPSArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0, i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                lps[i] = ++len;
                i++;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
        return lps;
    }
}