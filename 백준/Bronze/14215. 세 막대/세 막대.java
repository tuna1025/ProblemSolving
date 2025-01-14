import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max = Math.max(a, b);
        max = Math.max(max, c);
        int sum;
        if (max == a)sum = b+c;
        else if(max == b) sum = a+c;
        else sum = a+b;

        while(max>=sum){
            max--;
        }
        System.out.println(sum+max);
        br.close();
    }
}