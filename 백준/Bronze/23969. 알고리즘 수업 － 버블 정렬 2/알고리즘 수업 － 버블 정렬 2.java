import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 배열 크기
        int k = Integer.parseInt(st.nextToken()); // 교환 횟수

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bubbleSort(arr,n,k);

    }

    static void bubbleSort(int[] arr, int n, int k) {
        int cnt = 0;
        for (int last = n; last > 1; last--) {
            for (int j = 0; j < last-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    cnt++;
                }

                if (cnt == k) {
                    for(int m: arr){
                        System.out.print(m+" ");
                    }
                    return;
                }
            }
            
        }
        if (cnt < k) {
            System.out.println(-1);
        }
    }

}
