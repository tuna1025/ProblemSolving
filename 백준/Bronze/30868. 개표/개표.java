import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int a = n/5;
            int b = n%5;
            for (int j = 0; j < a; j++) {
                sb.append("++++ ");
            }
            for (int j = 0; j < b; j++) {
                sb.append("|");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
