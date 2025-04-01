import java.io.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        if (N<=b) {
            if (a == b) System.out.println("Anything");
            else if (a>b) System.out.println("Subway");
            else System.out.println("Bus");
        }
        else {
            System.out.println("Bus");
        }

    }
}