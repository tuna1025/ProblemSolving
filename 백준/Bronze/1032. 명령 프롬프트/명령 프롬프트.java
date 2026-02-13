import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n ==1) {
            System.out.println(br.readLine());
            return;
        }
        char[] arr= br.readLine().toCharArray();

        for(int i = 0; i < n-1; i++) {
            String s2 = br.readLine();
            for(int j = 0; j < s2.length(); j++) {
                if(s2.charAt(j) != arr[j]) {
                    arr[j] = '?';
                }
            }

        }
        System.out.println(new String(arr));

    }
}