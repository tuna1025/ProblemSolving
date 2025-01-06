import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[]{1,1,2,2,2,8};
        int index = 0;

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            System.out.print(arr[index] - n + " ");
            index++;
        }
    }
}

