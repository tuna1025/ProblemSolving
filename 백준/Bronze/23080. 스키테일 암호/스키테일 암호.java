import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        for (int i = 0; i < s.length(); i += n) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}