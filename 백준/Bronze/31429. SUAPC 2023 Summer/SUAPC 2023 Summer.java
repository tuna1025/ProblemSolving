import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] score={12,11,11,10,9,9,9,8,7,6,6};
        int[] penalty={1600,894,1327,1311,1004,1178,1357,837,1055,556,773};
        int n = Integer.parseInt(br.readLine());
        System.out.println(score[n-1] + " " + penalty[n-1]);
    }
}