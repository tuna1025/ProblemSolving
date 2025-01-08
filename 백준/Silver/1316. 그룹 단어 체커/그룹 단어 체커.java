import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int index = 0;
        int cnt = n;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length()-1; j++) {
                if(s.charAt(j) != s.charAt(j+1) ) {
                    index = j;
                    if(index != s.lastIndexOf(s.charAt(j))){
                        cnt--;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
        br.close();
    }
}