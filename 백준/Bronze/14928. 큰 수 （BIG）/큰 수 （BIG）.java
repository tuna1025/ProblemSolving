import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            result = (result * 10 + num.charAt(i) - '0') % 20000303;
        }// 나머지 구하는 공식
        System.out.println(result);

    }
}