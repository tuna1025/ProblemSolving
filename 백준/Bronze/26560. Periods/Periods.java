import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if(s.charAt(s.length()-1) != '.'){
                System.out.println(s + ".");
            }
            else{
                System.out.println(s);
            }
        }

        br.close();
    }
}