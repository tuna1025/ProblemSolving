import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        //문제는 피보나치 수열로 수열의 크기인 변을 가지는 사각형이 추가됨
        // 둘레 = 2(가로+세로)이므로 제일큰 사각형과 2번째로큰 사각현의 한변을 더해서 x 2해주면 됨
        long[] fib = new long[a + 1];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i <= a; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(2 * (fib[a]+fib[a-1]));
    }
}
