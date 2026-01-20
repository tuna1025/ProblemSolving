import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String longest = "";

        String line;
        while ((line = br.readLine()) != null) {
            // 알파벳과 하이픈이 아닌 모든 문자를 구분자로
            String[] words = line.split("[^a-zA-Z-]+");

            for (String w : words) {
                if (w.equals("E-N-D")) {
                    System.out.println(longest.toLowerCase());
                    return;
                }
                if (w.length() > longest.length()) {
                    longest = w;
                }
            }
        }
    }
}
