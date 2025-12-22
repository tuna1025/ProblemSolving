import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while((s = br.readLine()) != null) {
            int n = Integer.parseInt(s);

            int cnt = 1;
            int rem = 1 % n; // 1부터 시작

            while (rem != 0) {
                rem = (rem * 10 + 1) % n; //나누어 떨어질때까지 나머지 연산
                cnt++; // 자릿수 증가
            }

            System.out.println(cnt);

        }

    }
}
