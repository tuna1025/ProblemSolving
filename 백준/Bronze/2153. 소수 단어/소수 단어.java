import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            if (a >= 'a' && a <= 'z') {
                sum += a - 'a' + 1;
            }
            else{
                sum += a - 'A' + 27;
            }
        }

        for(int i = 2; i < sum; i++) {
            if (sum % i == 0) {
                System.out.println("It is not a prime word.");
                return;
            }
        }
        System.out.println("It is a prime word.");
    }
}