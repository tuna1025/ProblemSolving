import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lower = "roygbiv";
        String upper = "ROYGBIV";
        int n = Integer.parseInt(br.readLine());
        String word = br.readLine();

        boolean[] checkLower = new boolean[26];
        boolean[] checkUpper = new boolean[26];

        for(char c : word.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                checkLower[c - 'a'] = true;
            }
            else {
                checkUpper[c - 'A'] = true;
            }
        }

        boolean Lower = true;
        boolean Upper = true;
        for(char c : lower.toCharArray()) {
            if(!checkLower[c - 'a']) {
                Lower = false;
                break;
            }
        }
        for(char c : upper.toCharArray()) {
            if(!checkUpper[c - 'A']) {
                Upper = false;
                break;
            }
        }
        if(Lower && Upper) {
            System.out.println("YeS");
        }
        else if(Lower && !Upper) {
            System.out.println("yes");
        }
        else if(Upper && !Lower) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO!");
        }
    }
}
