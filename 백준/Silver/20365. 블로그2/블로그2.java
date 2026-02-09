import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int Bcnt = 0;
        int Rcnt = 0;
        char pre = s.charAt(0);

        if(pre == 'B') Bcnt++;
        else if(pre == 'R') Rcnt++;

        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);

            if(c != pre){
                if(c == 'B') Bcnt++;
                else Rcnt++;
                pre = c;
            }
        }
        System.out.println(Math.min(Bcnt, Rcnt)+1);

    }
}