import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int d = 0;
        int p = 0;
        for (int i = 0; i < n; i++) {
            if(Math.abs(d-p) >= 2) break;
            char c = br.readLine().charAt(0);
            if(c == 'D') d++;
            else p++;
        }
        System.out.printf("%d:%d\n", d, p);
    }
}
