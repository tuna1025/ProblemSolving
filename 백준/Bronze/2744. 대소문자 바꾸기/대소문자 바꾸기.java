import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(char i : s.toCharArray()) {
            if(Character.isUpperCase(i)) sb.append(Character.toLowerCase(i));
            else sb.append(Character.toUpperCase(i));
        }
        System.out.println(sb.toString());
    }
}