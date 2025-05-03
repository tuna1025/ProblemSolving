import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String token = br.readLine();
        int index = 0;
        int cnt = 0;
        while (index + token.length() <= s.length()) {

            if(token.equals(s.substring(index, index + token.length()))) {
                cnt++;
                index += token.length();
            }
            else {
                index++;
            }
        }
        System.out.println(cnt);
    }
}
