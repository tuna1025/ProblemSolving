import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 책 전체 개수
        int m = Integer.parseInt(st.nextToken()); // 더미 개수

        for (int i = 0; i < m; i++) {
            int m2 = Integer.parseInt(br.readLine()); // 더미에 있는 책 개수
            st = new StringTokenizer(br.readLine());

            int prev = Integer.parseInt(st.nextToken()); // 첫 번째 책
            for (int j = 1; j < m2; j++) {
                int cur = Integer.parseInt(st.nextToken());
                if (prev < cur) {
                    System.out.println("No");
                    return;
                }
                prev = cur;
            }
        }
        System.out.println("Yes");
    }
}
