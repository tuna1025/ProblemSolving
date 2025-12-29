import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder();

            char prev = 0;
            for (char c : s.toCharArray()) {
                if (c != prev) {
                    sb.append(c);
                    prev = c;
                }
            }
            System.out.println(sb.toString());
        }
    }
}
