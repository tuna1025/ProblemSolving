import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine().trim());

        StringBuilder sb = new StringBuilder();
        while(size --> 0) {
            String s = br.readLine();

            int[] alpha = new int[26];

            for(char ch : s.toCharArray()) {
                alpha[ch - 'A']++;
            }// 조합할수있는 알파벳의 개수 증가

            int size1 = Integer.parseInt(br.readLine());
            while(size1 --> 0) {
                int[] num = alpha.clone();
                sb.append(solve(br.readLine(), num)).append("\n");
            }
        }
        System.out.print(sb);
    }

    public static String solve(String s, int[] alpha) {
        for(char ch : s.toCharArray()) {
            if(alpha[ch - 'A']  == 0) {
                return "NO";
            }
            else {
                alpha[ch - 'A']--;
            }
        }
        return "YES";
    }
}