import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken()) ;
            int y = Integer.parseInt(st.nextToken()) ;
            boolean flag = false;
            for(int j = x; j <= M*N; j += M){
                if((j-1)%N + 1 == y){ // j%N을 하면 나머지는 0~N-1까지의 수인데 y는 N과 같은 수 가 될수 있어서 이렇게 함
                    flag = true;
                    System.out.println(j);
                    break;
                }

            }
            if(!flag){
                System.out.println(-1);
            }
        }

        br.close();
    }
}