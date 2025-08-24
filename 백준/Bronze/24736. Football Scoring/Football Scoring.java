import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[10];
        int a = 0;
        int b = 0;
        for (int i = 0; i < 10; i++) {
            scores[i] = sc.nextInt();
        }





        a = scores[0] * 6 + scores[1] * 3 + scores[2] * 2 + scores[3] * 1 + scores[4] * 2;
        b= scores[5] * 6 + scores[6] * 3 + scores[7] * 2 + scores[8] * 1 + scores[9] * 2;

        System.out.println(a + " " + b);

    }
}
