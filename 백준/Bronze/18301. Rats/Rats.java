import java.io.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int N = (int)Math.floor(((n1+1) * (n2+1) )/ (n3+1) -1);
        System.out.println(N);
    }
}