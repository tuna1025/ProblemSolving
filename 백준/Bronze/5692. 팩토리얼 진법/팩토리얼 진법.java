import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = br.readLine();
            int sum = 0;
            int cnt = 1;
            if(s.equals("0")) {
                return;
            }
            for(int i = s.length()-1; i>=0 ; i--) {
                int mul = 1;

                for(int j = 1; j <= cnt; j++){
                    mul *= j;
                }
                sum += (s.charAt(i) - '0')*mul;
                cnt++;
            }
            System.out.println(sum);
        }
    }
}