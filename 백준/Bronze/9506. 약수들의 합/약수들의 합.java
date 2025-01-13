import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true){
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            ArrayList <Integer> arr = new ArrayList <> ();
            if(n==-1) break;
            for (int i = 1; i < n; i++) {
                if(n%i == 0 && n!=i) {
                    arr.add(i);
                    sum += i;
                }//n이 아니고 약수이면 더해주기
            }
            if (sum == n){
                System.out.printf("%d = %d",n, arr.get(0));
                for (int i = 1;i < arr.size();i++) {
                    System.out.print(" + " + arr.get(i));
                }
                System.out.println();
            }
            else System.out.printf("%d is NOT perfect.\n", n);
        }

        br.close();
    }
}