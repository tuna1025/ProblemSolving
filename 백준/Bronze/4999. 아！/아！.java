import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s2 = br.readLine();
        if(s.length() >= s2.length()){
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }
        System.out.println();
    }

}