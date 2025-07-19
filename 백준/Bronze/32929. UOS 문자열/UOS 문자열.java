import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = n%3;
        if(a==1){
            System.out.println("U");
        }
        else if(a==2){
            System.out.println("O");
        }
        else{
            System.out.println("S");
        }
    }
}