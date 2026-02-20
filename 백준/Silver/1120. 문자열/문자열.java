import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int n = A.length();
        int m = B.length();

        int answer = Integer.MAX_VALUE;

        for (int i = 0; i <= m - n; i++) {
            int diff = 0;

            for (int j = 0; j < n; j++) {
                if (A.charAt(j) != B.charAt(i + j)) {
                    diff++;
                }
            }

            answer = Math.min(answer, diff);
        }

        System.out.println(answer);
    }
}