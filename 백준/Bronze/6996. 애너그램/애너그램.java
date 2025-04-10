import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Map<Character,Integer> mapWord1 = new HashMap<>();
            Map<Character,Integer> mapWord2 = new HashMap<>();
            String word1 = st.nextToken();
            String word2 = st.nextToken();
            for (int i = 0; i < word1.length(); i++) {
                mapWord1.put(word1.charAt(i), mapWord1.getOrDefault(word1.charAt(i),0) + 1);
            }
            for (int i = 0; i < word2.length(); i++) {
                mapWord2.put(word2.charAt(i), mapWord2.getOrDefault(word2.charAt(i),0) + 1);
            }
            
            System.out.println(word1 + " & " + word2 + " are " + (mapWord2.equals(mapWord1) ? "anagrams." : "NOT anagrams."));
        }
        br.close();
    }

}