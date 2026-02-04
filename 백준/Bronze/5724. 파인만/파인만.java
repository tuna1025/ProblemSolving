import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            if (n == 0) break;
            // n = 3일때, 크기가 1인 사각형 3^2, 크기가 2인 사각형 2^2 크기가 3인사각형 1(1^1)
            for (int i = 1; i <= n; i++) {
                sum += i*i;
            }
            System.out.println(sum);
        }
    }
}