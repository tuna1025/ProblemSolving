import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Integer.parseInt(br.readLine());
        System.out.println(a*a<= 100000000? "Accepted":"Time limit exceeded");

    }
}