import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) sum += i;
        }
        System.out.println(sum*5 -24);

    }
}