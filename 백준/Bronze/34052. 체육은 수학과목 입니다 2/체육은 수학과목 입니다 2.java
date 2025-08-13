import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for(int i = 0; i <4; i++){
            int n = Integer.parseInt(br.readLine());
            sum += n;
        }
        if(sum <= 1500){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
