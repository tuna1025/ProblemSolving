import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = Integer.parseInt(br.readLine()); //처음나온 숫자 읽어주기

        while(true) {
            String S = br.readLine(); // +, -, *, /, = 읽기
            if(S.equals("=")) break; // = 나오면 종료

            int N = Integer.parseInt(br.readLine()); // 숫자 읽기
            
            if(S.equals("+")) {
                res += N;
            }else if(S.equals("-")){
                res -= N;
            }else if(S.equals("*")){
                res *= N;
            }else{
                res /= N;
            }
        }
        System.out.println(res);
    }
}