import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true) {
            int n = Integer.parseInt(br.readLine());
            if(n == -1) {
                break;
            }
            sum += n;
        }
        System.out.println(sum);

    }
}
