import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 10;
        while(n>num){ // 가장 큰 자릿수 까지 반복
            int remainder = n%num;
            int mid = num / 2; //기준값

            if(remainder>=mid){
                n = (n/num + 1) * num;
            }
            else{
                n = (n/num) * num;
            }

            num *= 10;
        }

        System.out.println(n);


    }
}
