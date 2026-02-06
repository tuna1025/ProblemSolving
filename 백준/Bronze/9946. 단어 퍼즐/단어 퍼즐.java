import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int caseNum = 1;

        while (true) {
            String s1 = br.readLine();
            String s2 = br.readLine();

            // 종료 조건
            if (s1.equals("END") && s2.equals("END")) {
                break;
            }

            int[] cnt = new int[26];

            for (int i = 0; i < s1.length(); i++) {
                cnt[s1.charAt(i) - 'a']++;
            }

            for (int i = 0; i < s2.length(); i++) {
                cnt[s2.charAt(i) - 'a']--;
            }

            boolean same = true;
            for (int i = 0; i < 26; i++) {
                if (cnt[i] != 0) {
                    same = false;
                    break;
                }
            }

            if (same) {
                System.out.println("Case " + caseNum + ": same");
            } else {
                System.out.println("Case " + caseNum + ": different");
            }

            caseNum++;
        }
    }
}
