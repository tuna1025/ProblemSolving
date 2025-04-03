import java.io.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> s1 = new HashMap<>();
        Map<Character, Integer> s2 = new HashMap<>();
        String line1 = br.readLine();
        for (int i = 0; i < line1.length(); i++) {
            s1.put(line1.charAt(i), s1.getOrDefault(line1.charAt(i), 0) + 1);
        }
        String line2 = br.readLine();
        for (int i = 0; i < line2.length(); i++) {
            s2.put(line2.charAt(i), s2.getOrDefault(line2.charAt(i), 0) + 1);
        }

        int cnt = 0;
        for(Map.Entry<Character, Integer> entry : s1.entrySet()) {
            if(!s2.containsKey(entry.getKey())) {
                cnt += entry.getValue();
            }
            else{
                cnt += Math.abs(entry.getValue() - s2.get(entry.getKey()));
            }
        }
        for (Map.Entry<Character, Integer> entry : s2.entrySet()) {
            if(!s1.containsKey(entry.getKey())) {
                cnt += entry.getValue();
            }
        }
        System.out.println(cnt);
    }
}