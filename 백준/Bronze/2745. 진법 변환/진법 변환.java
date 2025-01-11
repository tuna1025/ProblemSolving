import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int sum = 0;
        int count = 0;
        for (int i = s.length()-1; i>=0 ; i--) {
            if(s.charAt(i) >= 'A'){
                int a = s.charAt(i) - 55;
                sum += Math.pow(n, count) * a;
                count++;}
            else {
                int a = s.charAt(i) - '0';
                sum += Math.pow(n, count) * a;
                count++;
            }
        }
        System.out.println(sum);
        br.close();
    }
}

