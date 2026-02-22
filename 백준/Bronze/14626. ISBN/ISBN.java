import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();
        
        int sum = 0;
        int starIndex = -1;
        
        for (int i = 0; i < 13; i++) {
            char c = isbn.charAt(i);
            
            if (c == '*') {
                starIndex = i;
                continue;
            }
            
            int num = c - '0';
            
            if (i % 2 == 0) {
                sum += num;
            } else {
                sum += 3 * num;
            }
        }
        
        int weight = (starIndex % 2 == 0) ? 1 : 3;
        
        for (int x = 0; x <= 9; x++) {
            if ((sum + weight * x) % 10 == 0) {
                System.out.println(x);
                break;
            }
        }
    }
}