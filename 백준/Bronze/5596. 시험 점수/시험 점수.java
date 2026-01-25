import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = 0;
        for (int i = 0; i < 4; i++) {
            S += Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = 0;
        for (int i = 0; i < 4; i++) {
            T += Integer.parseInt(st.nextToken());
        }

        System.out.println(S >= T ? S : T);
    }
}
