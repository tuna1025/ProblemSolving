import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] alphabet = new char[26];
        int [] alphabetIndex = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)('a' + i);
            alphabetIndex[i] = - 1;
        }


        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {

                if (s.charAt(i) == alphabet[j]) {
                    if (alphabetIndex[j] == -1)  alphabetIndex[j] = i;
                }
            }
        }

        for (int i = 0; i < alphabetIndex.length; i++) {
            System.out.print(alphabetIndex[i]+ " ");
        }

    }

}
