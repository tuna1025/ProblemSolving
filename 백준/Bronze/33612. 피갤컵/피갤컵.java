import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int year = 2024;
        int month = 1 + a*7;

        year += (month - 1) / 12;
        month = (month - 1) % 12 + 1;

        System.out.println(year +" "+ month);


    }

}