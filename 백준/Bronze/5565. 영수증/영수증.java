import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        int res = 0;

        for(int i = 0; i<9; i++){
            sum -= Integer.parseInt(br.readLine());
        }
        System.out.println(sum);
    }
}
