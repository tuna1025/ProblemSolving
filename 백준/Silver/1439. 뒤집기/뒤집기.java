import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int zeroCnt = 0;
        int oneCnt = 0;
        if (s.charAt(0) == '0') {
            zeroCnt++;
        }
        else oneCnt++;

        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(i - 1)) {
                if (s.charAt(i) == '0') {
                    zeroCnt++;
                }
                else oneCnt++;
            }
        }
        System.out.println(Math.min(zeroCnt, oneCnt));
    }
}
