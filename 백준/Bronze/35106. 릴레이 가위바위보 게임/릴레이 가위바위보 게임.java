import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] count = new int[4]; 

        for (int i = 0; i < 3 * N; i++) {
            int x = sc.nextInt();
            count[x]++;
        }

        int correct = 0; 
        int wrong = 0;   

        for (int i = 1; i <= 3; i++) {
            if (count[i] == N - 1) correct = i;
            if (count[i] == N + 1) wrong = i;
        }

        System.out.println(correct);
        System.out.println(wrong);
    }
}