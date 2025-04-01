import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] p = new int[4];
        for (int i =0; i<4; i++) {
            p[i] = in.nextInt();
        }
        int x = in.nextInt();
        int y = in.nextInt();
        int r = in.nextInt();
        for (int i =0; i<4; i++) {
            if(p[i] == x){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println(0);
    }
}