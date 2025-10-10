import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            BigInteger n = new BigInteger(br.readLine());
            if (n.equals(BigInteger.ZERO)) break;

            if (n.mod(BigInteger.valueOf(42)).equals(BigInteger.ZERO)) {
                System.out.println("PREMIADO");
            } else {
                System.out.println("TENTE NOVAMENTE");
            }
        }
    }
}