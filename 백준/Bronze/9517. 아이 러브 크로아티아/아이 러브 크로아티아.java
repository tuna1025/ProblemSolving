import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine())-1;
        int n = Integer.parseInt(br.readLine());
        int time = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time += Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            if (time > 210) {
                System.out.println(k + 1);
                return;
            }
            if (s.equals("T")) {
                k = (k+1)%8;
            }

        }



    }
}
