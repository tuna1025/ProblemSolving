import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = st.nextToken();
            map.put(key, map.getOrDefault(key, 0) + 1 );
        }
        String s = br.readLine();
        System.out.println(map.get(s) == null ? 0:map.get(s));
    }
}