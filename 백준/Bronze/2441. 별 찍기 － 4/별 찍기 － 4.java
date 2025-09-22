import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - cnt; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < cnt; j++) {
                System.out.printf("*");
            }
            cnt--;
            System.out.println();
        }
    }
}