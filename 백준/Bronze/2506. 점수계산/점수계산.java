import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int cnt = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                sum += cnt;
                cnt++;
            }
            else{
                cnt = 1;
            }
        }
        System.out.println(sum);
    }

}