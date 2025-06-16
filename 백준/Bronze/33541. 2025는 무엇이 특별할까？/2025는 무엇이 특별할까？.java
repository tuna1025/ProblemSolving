import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        for (int i = year+1; i <= 9999; i++) {
            int n = i / 100;
            int m =  i % 100;

            if(Math.pow(n+m,2) == i){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}