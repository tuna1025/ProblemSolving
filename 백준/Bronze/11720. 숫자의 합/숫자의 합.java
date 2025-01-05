import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        String s = br.readLine();
        for (int i = 0; i < n; i++) {
            sum += Character.getNumericValue(s.charAt(i));
        }



        System.out.println(sum);

        br.close();
    }

}
