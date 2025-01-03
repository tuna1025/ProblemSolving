import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];
        for (int i = 0; i < 28; i++) {
            int N = Integer.parseInt(br.readLine());
            arr[N-1] = 1;
        }// 입력받은 출석번호를 배열 위치에 1(true)로 표시
        
        for (int i = 0; i < 30; i++) {
            if (arr[i] == 0) {
                System.out.println(i+1);
            }
        }// 배열에 인덱스가 0이면 인덱스 출력


    }
}
