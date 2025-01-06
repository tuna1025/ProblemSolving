import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String reverseA = "";
        String reverseB = "";

        String A = st.nextToken();
        String B = st.nextToken();

        for (int i = A.length()-1; i >= 0; i--) {
            reverseA = reverseA + A.charAt(i);
        }
        for (int i = B.length()-1; i >= 0; i--) {
            reverseB = reverseB + B.charAt(i);
        }
        //문자열 거꾸로 옳겨쓰기
        
        int a = Integer.parseInt(reverseA); 
        int b = Integer.parseInt(reverseB);// 문자열 int형으로 전환
        
        if (a > b) System.out.println(a);
        else System.out.println(b);
        //크기비교후 출력
        br.close();
    }
}