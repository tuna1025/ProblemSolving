import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(s.charAt(i) == '4'||s.charAt(i) == '5') {
                if (sb.length() >= 2) {
                    if (sb.charAt(sb.length() - 2) == 'P' &&
                            sb.charAt(sb.length() - 1) == 'S') {
                        continue; // 숫자 삭제
                    }
                }
            }
            sb.append(c);
        }
        System.out.println(sb);

    }
}