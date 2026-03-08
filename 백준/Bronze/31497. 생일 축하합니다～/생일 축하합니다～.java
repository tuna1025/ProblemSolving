import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] names = new String[N];

        for (int i = 0; i < N; i++) {
            names[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            int cnt = 0;

            for (int j = 0; j < 3; j++) {
                System.out.println("? " + names[i]);
                System.out.flush();

                int res = Integer.parseInt(br.readLine());
                if (res == 1) cnt++;
            }

            if (cnt >= 2) {
                System.out.println("! " + names[i]);
                System.out.flush();
                return;
            }
        }
    }
}