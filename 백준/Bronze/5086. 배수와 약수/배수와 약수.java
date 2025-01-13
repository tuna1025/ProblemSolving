import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==b && a==0) break;
            if(b%a == 0) System.out.println("factor");
            else if(a%b == 0) System.out.println("multiple");
            else System.out.println("neither");
        }

        br.close();
    }
}