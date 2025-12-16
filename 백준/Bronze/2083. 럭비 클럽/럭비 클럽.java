import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            // 종료 조건
            if (name.equals("#") && age == 0 && weight == 0) {
                break;
            }

            // 분류 조건
            if (age > 17 || weight >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }
    }
}
