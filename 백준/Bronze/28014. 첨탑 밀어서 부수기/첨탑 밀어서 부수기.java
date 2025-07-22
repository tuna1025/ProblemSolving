import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }//높이 입력

        for (int i = 0; i < n; i++) {
            cnt++;
            int h = arr[i];
            while(i+1 < n && h > arr[i+1]){
                h = arr[i+1];
                i++;
            }
        }

        System.out.println(cnt);
    }
}