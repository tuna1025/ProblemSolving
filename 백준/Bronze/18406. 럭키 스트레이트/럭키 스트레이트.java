import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        long front=0, back= 0;
        for (int i = 0; i < arr.length/2; i++) {
            front += arr[i];
        }
        for(int i = arr.length/2; i < arr.length; i++) {
            back += arr[i];
        }
        if(front == back) System.out.println("LUCKY");
        else System.out.println("READY");


    }
}