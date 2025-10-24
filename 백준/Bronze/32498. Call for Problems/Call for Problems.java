import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            if(Integer.parseInt(br.readLine()) %2 != 0){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}