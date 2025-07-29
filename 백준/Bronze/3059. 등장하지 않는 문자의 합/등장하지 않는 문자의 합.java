import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] alphabet = { 'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z' };
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            boolean[] exist = new boolean[26];
            String s = br.readLine();
            int sum = 0;

            for (int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 'A';
                exist[index] = true;
            }//문자열 검사

            for (int i = 0; i < 26; i++) {
                if (!exist[i]) {
                    sum += 'A' + i;
                }// 문자열에 존제하지 않으면 아스키 코드 값 더함
            }
            System.out.println(sum);
        }

    }
}
