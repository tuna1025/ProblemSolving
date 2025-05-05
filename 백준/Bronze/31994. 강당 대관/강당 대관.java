import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        String ans = "";
        for(int i = 0; i <7; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int temp = Integer.parseInt(st.nextToken());
            if(temp > max){
                ans = s;
                max = temp;
            }
        }
        System.out.println(ans);


    }
}
