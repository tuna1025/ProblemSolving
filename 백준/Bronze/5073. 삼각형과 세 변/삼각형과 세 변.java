import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            int max;
            int sum;
            if (a == b && c == b && b == 0){
                break;
            }
            max = Math.max(a, b);
            max = Math.max(max, c);
            if (max == a)sum = b+c;
            else if(max == b) sum = a+c;
            else sum = a+b;

            if(max >= sum) System.out.println("Invalid");
            else if(a==b && b == c){
                System.out.println("Equilateral");
            }
            else if (a==c || b==c || a==b) {
                System.out.println("Isosceles");
            }
            else if(a!=b && b!=c && a!=c){
                System.out.println("Scalene");
            }
        }
        br.close();
    }
}