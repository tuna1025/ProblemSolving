import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        HashMap<Integer,Integer> type = new HashMap<Integer,Integer>();

        type.put(136,1000);
        type.put(142,5000);
        type.put(148,10000);
        type.put(154,50000);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken())/68;
            sum += type.get(cost) * cnt;
        }
        System.out.println(sum);
    }
}
