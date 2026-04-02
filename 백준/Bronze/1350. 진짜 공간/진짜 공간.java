import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] files = new long[N];

        for(int i = 0; i < N; i++) {
            files[i] = sc.nextLong();
        }

        long cluster = sc.nextLong();
        long total = 0;

        for(int i = 0; i < N; i++) {
            long clusters = (files[i] + cluster - 1) / cluster;
            total += clusters * cluster;
        }

        System.out.println(total);
    }
}