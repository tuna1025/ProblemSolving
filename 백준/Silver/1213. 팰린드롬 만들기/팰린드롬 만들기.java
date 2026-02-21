import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] count = new int[26];

        for (char c : s.toCharArray()) {
            count[c - 'A']++;
        }// 알파벳 개수세기

        int oddCnt = 0; //홀수인 문자의 개수, 이게 2개 이상이면 대칭 안됨
        int oddIndex = -1; // 홀수 알파벳 순서


        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 != 0) {
                oddCnt++;
                oddIndex = i;
            }
        }
        if (oddCnt > 1) {
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder half = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < count[i]/2; j++) {
                half.append((char)(i + 'A'));
            }
        }



        StringBuilder res = new StringBuilder();
        res.append(half);

        if (oddIndex != -1) {
            res.append((char)(oddIndex + 'A'));
        }

        res.append(half.reverse());

        System.out.println(res.toString());
    }
}