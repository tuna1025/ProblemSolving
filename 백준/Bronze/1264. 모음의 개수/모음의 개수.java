import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = { 'a', 'e', 'i', 'o', 'u'};
        while (true) {
            String s = br.readLine();
            int cnt = 0;
            if (s.charAt(0) == '#') break;
            for (int i = 0; i < s.length(); i++) {
                for(char c : arr){
                    if(s.charAt(i) == c || s.charAt(i) == c - 32)cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}