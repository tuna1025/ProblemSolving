import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int nextInt = 1;
        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;
            sb.append(s).append(" ");
            while (true) {
                if (s.length() == 1) break;
                for (int i = 0; i < s.length(); i++) {
                    int c = s.charAt(i) - '0';
                    nextInt *= c;
                }
                sb.append(nextInt).append(" ");
                s = Integer.toString(nextInt);
                nextInt = 1;
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}