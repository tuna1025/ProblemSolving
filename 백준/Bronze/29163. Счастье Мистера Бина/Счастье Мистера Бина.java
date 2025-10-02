import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int odd = 0;
        int even = 0;

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(st.nextToken()) % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        if (odd >= even) {
            System.out.println("Sad");
        }
        else {
            System.out.println("Happy");
        }

    }
}