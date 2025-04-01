import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n-2) % 7 == 0) System.out.println(1);
        else System.out.println(0);
    }
}