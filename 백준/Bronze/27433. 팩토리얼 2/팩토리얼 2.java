import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long num = 1;
        if(n == 0){
            System.out.println("1");
            return;
        }
        for(int i = 1; i<=n; i++){
            num = num*i;
        }
        System.out.println(num);

    }
}
