import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i < 5; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 0; i < 10; i++) {
            if(arr[i] %2 == 1){
                System.out.println(i);
            }
        }
    }
}