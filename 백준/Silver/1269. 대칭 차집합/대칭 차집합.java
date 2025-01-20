import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            b.add(Integer.parseInt(st.nextToken()));
        }
        HashSet<Integer> removeA = new HashSet<>(a);
        HashSet<Integer> removeB = new HashSet<>(b);
        removeA.removeAll(b);
        removeB.removeAll(a);
        System.out.println(removeA.size() + removeB.size());
        br.close();
    }
}
