import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }// 입력받기

        //이미 칠해진 부분이 조건을 깨는지 확인
        for (int i = 1; i < n; i++) {
            if (arr[i] != 0 && arr[i] == arr[i - 1]) {
                System.out.println(-1);
                return;
            }
        }

        // 0인 부분 채우기
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int color = 1; color <= 3; color++) {
                    boolean ok = true;

                    if (i > 0 && arr[i - 1] == color) ok = false; //첫번째 카드아니고, 지금색과 같으면 false
                    if (i < n - 1 && arr[i + 1] == color && arr[i + 1] != 0) ok = false; //마지막카드아니고  왼쪽이 같고 오른쪽이 색칠되있으면

                    if (ok) {
                        arr[i] = color;
                        break;
                    }
                }
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
