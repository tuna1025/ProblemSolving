import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int t = 0; t < T; t++) {
            String a = sc.next();
            String b = sc.next();
            
            BigInteger A = new BigInteger(a, 2);
            BigInteger B = new BigInteger(b, 2);
            
            System.out.println(A.add(B).toString(2));
        }
    }
}