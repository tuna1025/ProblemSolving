import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = n; i <= m; i++) {
            int cnt = 0;
            if (i != 1){
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        cnt++;
                    }
                }
            }
            if (cnt == 1) {
                sum+=i;
                if(min>i) min=i;
            }

        }
        if(sum!=0) {
            System.out.println(sum);
            System.out.printf("%d", min);
        }
        else System.out.printf("%d", -1);



        br.close();
    }
}