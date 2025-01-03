import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int N = Integer.parseInt(br.readLine());
            arr[N % 42] = 1;
        }// 나머지값을 인덱스로 1에다 집어넣음

        for (int i = 0; i < 42; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }// 배열에 1이 있으면 카운트 증가
        
        System.out.println(count);
    br.close();
    }
}
