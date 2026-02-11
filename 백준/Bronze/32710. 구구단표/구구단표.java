import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n<=9) {
            System.out.println(1);
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i<=9; i++){
            for(int j = 1; j<=9; j++){
                set.add(i*j);
            }
        }
        if(set.contains(n)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }
}