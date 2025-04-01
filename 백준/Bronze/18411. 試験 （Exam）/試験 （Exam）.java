import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int sum = a[2] + a[1];
        System.out.println(sum);
    }
}