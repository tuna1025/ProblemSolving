import java.io.*;
import java.util.*;


class Main {
        public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = Integer.parseInt(st.nextToken());
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }
            else map.put(key, 1);
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(st.nextToken());
            bw.write(map.getOrDefault(a,0) + " ");
        }
        bw.flush();
        bw.close();
        br.close();
        }
}