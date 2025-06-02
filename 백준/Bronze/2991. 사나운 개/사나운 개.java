import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int attackA = Integer.parseInt(st.nextToken());
        int restA = Integer.parseInt(st.nextToken());
        int attackB = Integer.parseInt(st.nextToken());
        int restB = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            int n = Integer.parseInt(st.nextToken());
            boolean A = ((n-1) % (attackA + restA)) < attackA;
            boolean B = ((n-1) % (attackB + restB)) < attackB;
            System.out.println((A ? 1 : 0) + (B ? 1 : 0));
        }
    }
}