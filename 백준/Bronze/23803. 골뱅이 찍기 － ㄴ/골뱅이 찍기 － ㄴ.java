import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N*4; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N*5; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}