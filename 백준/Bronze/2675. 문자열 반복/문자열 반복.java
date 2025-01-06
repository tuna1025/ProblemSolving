import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());//테스트 케이스의 수

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (int k = 0; k < s.length(); k++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(s.charAt(k));
                }// 입력받은 n만큼 k번째 문자열 개별적으로 n번 출력
            }
            System.out.println();
        }


    }

}
