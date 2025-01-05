import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        double[] arr2 = new double[n];
        double sum = 0;
        int max = Integer.MIN_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }// 배열에 집어넣기
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }//최대값찾기
        for (int i = 0; i < n; i++) {
            arr2[i] = (double)arr[i]/max*100;
        }// 조작한 점수 arr2에 실수형으로 넣기
        for (double j: arr2){
            sum += j;
        }

        System.out.println(sum/n);

        br.close();
    }
}
