import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x_max = Integer.MIN_VALUE, x_min = Integer.MAX_VALUE, y_max = Integer.MIN_VALUE, y_min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (n == 1) {
                break;
            }
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            x_max = Math.max(x_max, x);
            x_min = Math.min(x_min, x);
            y_max = Math.max(y_max, y);
            y_min = Math.min(y_min, y);
        }
        if (n == 1) {
            System.out.println(0);
        }
        else System.out.println((x_max - x_min) * (y_max - y_min));
        br.close();
    }
}

