import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) + 1;
        while (--n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}