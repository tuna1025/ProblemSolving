import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n =  Integer.parseInt(br.readLine());
       String s = br.readLine();
       int sum = 0;
       for (int i = 0; i < s.length(); i++) {
           sum += s.charAt(i) - '@';
       }
        System.out.println(sum);
    }
}
