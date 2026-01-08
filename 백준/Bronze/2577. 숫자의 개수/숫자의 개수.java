import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String s = String.valueOf(a*b*c);
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'0']++;
        }
        for(int i: arr){
            System.out.println(i);
        }
    }
}
