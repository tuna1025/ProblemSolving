import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        System.out.println(sum(1, n));

    }

    public static BigInteger sum(int start, int n) {
        BigInteger result = BigInteger.valueOf(start);

        if(start < n){
            int temp = (start+n)/2;
            result = sum(start,temp).multiply(sum(temp+1, n));
        }
        return result;
    }
}