import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        String s = br.readLine();
        BigInteger b = new BigInteger(br.readLine());
        if (s.equals("+")) System.out.println(a.add(b));
        else if (s.equals("*")) System.out.println(a.multiply(b));
        
        br.close();
    }
}