import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = {'M','O','B','I','S'};
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char c : chars) {
            if (!map.containsKey(c)) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}

