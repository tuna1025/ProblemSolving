import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.StringTokenizer;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        while (st.hasMoreTokens()) {
            if (st.nextToken().equals(n)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}