import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int index = s.length() - 1;
        char[] arr = new char[s.length()];
        char[] rarr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
            rarr[i] = s.charAt(index);
            index--;
        }
        String res = new String(arr);
        String res2 = new String(rarr);
        if (res.equals(res2)) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }





    }
}
