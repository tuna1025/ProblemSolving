import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] alpha = {' ','A','B','C','D','E','F','G','H',
                     'I','J','K','L','M','N','O','P','Q',
                     'R','S','T','U','V','W','X','Y','Z'};

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            int length = 0;
            int[][] arr = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = s.charAt(length) - '0';
                    length++;
                }
            } // 배열입력

            int top = 0;
            int bottom = r-1;
            int left = 0;
            int right = c-1;
            sb = new StringBuilder();

            while (top <= bottom && left <= right ) {
                for (int i = left; i <= right; i++) {
                    sb.append(arr[top][i]);
                }
                top++;
                for (int i = top; i <= bottom; i++) {
                    sb.append(arr[i][right]);
                }
                right--;
                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        sb.append(arr[bottom][i]);
                    }
                    bottom--;
                }
                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        sb.append(arr[i][left]);
                    }
                    left++;
                }
            }// 소용돌이 탐색

            String binary = sb.toString();
            StringBuilder result = new StringBuilder();
            int slicelength = binary.length() - (binary.length() % 5); // 나머지 자투리 버리기
            for (int i = 0; i < slicelength; i += 5) {
                String chunk = binary.substring(i, i + 5);
                result.append(alpha[Integer.parseInt(chunk, 2)]);
            }// 5개씩 잘라서 2진수를 10진수로 바꾸고 알파벳과 매칭해서 출력
            System.out.println(result.toString().trim());
        }

    }
}
