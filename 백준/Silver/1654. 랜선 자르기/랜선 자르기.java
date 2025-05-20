import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken()); //자를 랜선의 개수
        int N = Integer.parseInt(st.nextToken()); //필요한 랜선의 개수
        int[] arr = new int[K];
        long min = 0;
        long max = 0;
        long mid = 0;
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(arr[i], max);
        }
        max++;
        while(min < max){
            long sum = 0;
            mid = (min + max) / 2;
            for (int i = 0; i < K; i++) {
                sum += arr[i]/mid;
            }
            if (sum >= N){
                min = mid + 1;
            }
            else {
                max = mid;
            }
        }

        System.out.println(min-1);
    }
}