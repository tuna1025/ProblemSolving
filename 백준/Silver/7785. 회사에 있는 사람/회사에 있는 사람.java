import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;


class Main {
        public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            if (st.nextToken().equals("enter")) {
                set.add(name);
            } else set.remove(name);
        }
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list,Collections.reverseOrder());
        for (String s : list) {
            System.out.println(s);
        }
        br.close();
        }
}