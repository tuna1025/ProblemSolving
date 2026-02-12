import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            System.out.print("Pairs for " + n + ":");

            boolean first = true;  // 첫 쌍인지 확인

            for (int a = 1; a < n; a++) {
                int b = n - a;

                if (a < b) {
                    if (first) {
                        System.out.print(" " + a + " " + b);
                        first = false;
                    } else {
                        System.out.print(", " + a + " " + b);
                    }
                } else {
                    break;
                }
            }

            System.out.println(); // 줄바꿈
        }
    }
}