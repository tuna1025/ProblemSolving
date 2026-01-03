import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            for (char c : line.toCharArray()) {
                if (c == 'i') sb.append('e');
                else if (c == 'e') sb.append('i');
                else if (c == 'I') sb.append('E');
                else if (c == 'E') sb.append('I');
                else sb.append(c);
            }
            System.out.println(sb.toString());
        }
    }
}
