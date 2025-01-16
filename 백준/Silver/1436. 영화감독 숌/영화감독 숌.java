import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 665;
        int cnt = 0;
        while (true) {

            if (cnt == n) {
                System.out.println(num-1);
                break;
            }
            String s = String.valueOf(num);
            if (s.contains("666")) {
                cnt++;
            }
            num++;
        }
    }
}

