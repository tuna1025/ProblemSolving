import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    n = n/i; 
                    System.out.println(i);
                    break;
                }//최소인 소수일때 나누고 업데이트 후 탈출
            }
        }//n은 1일때 탈출
        br.close();
    }
}