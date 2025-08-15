import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String StringA = "";
        String StringB = "";
        int sum = 0;
        for (int i = 0; i < a; i++) {
           StringA += "1";
        }
        for (int i = 0; i < b; i++) {
            StringB += "1";
        }

        System.out.println(Integer.parseInt(StringA) + Integer.parseInt(StringB));
    }
}
