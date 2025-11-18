import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(sc.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        st = new StringTokenizer(sc.readLine());
        long result = 1;

        for(int i=0; i<n; i++){
            array[i] = Integer.parseInt(st.nextToken()) % m;
            result = (result * array[i]) % m;
        } 
        System.out.println(result);
    }
}