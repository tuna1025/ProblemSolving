import java.io.*;
import java.util.*;


class Main {
        public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap <String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n+m; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) {
                list.add(s);
            }
            else {
                map.put(s, 1);
            }
        }
        Collections.sort(list);
        bw.write(list.size() + "\n");
        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
        }
}

