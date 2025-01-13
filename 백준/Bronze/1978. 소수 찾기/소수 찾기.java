import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            int a = Integer.parseInt(st.nextToken());
            int cnt = 0;
            if(a != 1){
                for(int i = 2; i <= a; i++){
                    if (a % i == 0){
                        cnt++;
                    }
                }
                if (cnt == 1){
                    m++;
                }
            }
        }
        System.out.println(m);
        br.close();
    }
}