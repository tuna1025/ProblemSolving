import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(br.readLine());
        int langAmount = Integer.parseInt(br.readLine());
        int mathAmount = Integer.parseInt(br.readLine());
        int lang = Integer.parseInt(br.readLine());
        int math = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (langAmount > 0 || mathAmount > 0) {
            langAmount -= lang;
            mathAmount -= math;
            cnt++;
        }
        System.out.println(days - cnt);
    }
}
