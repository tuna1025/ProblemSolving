import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int a = n/5;
        int b = n%5;

        for(int i = 0; i < a; i++){
            sb.append("V");
        }
        for(int i = 0; i < b; i++){
            sb.append("I");
        }
        System.out.printf(sb.toString());

    }
}