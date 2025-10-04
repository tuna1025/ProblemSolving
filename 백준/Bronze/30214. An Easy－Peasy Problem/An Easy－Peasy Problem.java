import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double n = Integer.parseInt(st.nextToken());
        double m = Integer.parseInt(st.nextToken());
        if(n >= (m/2)){
            System.out.println("E");
        }
        else{
            System.out.println("H");
        }



    }
}