import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "WelcomeToSMUPC";
        int n = Integer.parseInt(br.readLine());
        int index = (n-1) % s.length();

        System.out.println(s.charAt(index));

    }
}