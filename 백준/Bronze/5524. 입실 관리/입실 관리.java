import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i < a; i++) {
            String s = br.readLine();
            for(int j = 0; j < s.length(); j++) {
                System.out.printf("%c",Character.toLowerCase(s.charAt(j)));
            }
            System.out.println();
        }
    }
}