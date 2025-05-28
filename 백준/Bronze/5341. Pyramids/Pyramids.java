import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedMap;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == 0)break;
            int sum = 0;
            for(int i = 1; i <= n; i++){
                sum += i;
            }
            System.out.println(sum);
        }
    }
}