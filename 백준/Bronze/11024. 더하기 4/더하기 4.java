import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;
import java.util.StringTokenizer;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }
            System.out.println(sum);
        }
    }
}