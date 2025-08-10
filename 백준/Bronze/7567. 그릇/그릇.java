import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int length = 10;
        for (int i = 1; i < s.length(); i++) {
            char a = s.charAt(i);
            char before = s.charAt(i - 1);
            if(a == before) {
                length += 5;
            }
            else{
                length += 10;
            }
        }

        System.out.println(length);

    }
}
