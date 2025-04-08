import com.sun.jdi.Value;

import java.io.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int n = Integer.parseInt(num);
        int cnt = 0;
        if(n < 10){
            for(int i = 1; i <= n; i++){
                cnt++;
            }
            System.out.println(cnt);
        }
        else{
            cnt = 9;
            String start = "10";
            while(Integer.parseInt(start) <= n){
                int sum = 0;
                for(int i = 0; i < start.length(); i++){
                    sum += start.charAt(i) - '0';
                }
                if(Integer.parseInt(start) % sum == 0){
                    cnt++;
                }
                start = String.valueOf(Integer.parseInt(start) + 1);
            }
            System.out.println(cnt);
        }
    }
}