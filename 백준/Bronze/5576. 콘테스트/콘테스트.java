import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int[] arr2 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 10; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int sum = 0;
        int sum2 = 0;
        for (int i = 9; i >= 7; i--) {
            sum += arr[i];
        }
        for (int i = 9; i >= 7; i--) {
            sum2 += arr2[i];
        }
        System.out.printf("%d %d\n", sum, sum2);
    }
}