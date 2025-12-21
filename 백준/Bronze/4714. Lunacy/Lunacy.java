import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            double earth = Double.parseDouble(line);

            // 음수면 입력 종료
            if (earth < 0) break;

            double moon = earth * 0.167;

            System.out.printf(
                "Objects weighing %.2f on Earth will weigh %.2f on the moon.%n",
                earth, moon
            );
        }
    }
}
