import java.io.*;
import java.util.StringTokenizer;

/* 토큰화 안쓰고 스플릿으로
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수 읽기
        for (int test = 0; test < T; test++) {
            String line = br.readLine().trim(); // 한 줄의 입력 읽기
            String[] numbers = line.split(" "); // 공백으로 분리하여 숫자 추출
            int N = Integer.parseInt(numbers[0]);
            int M = Integer.parseInt(numbers[1]);

            bw.write((N + M) + "\n"); // 두 정수를 더한 결과를 출력
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
*/
public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수 읽기
        for (int test = 0; test < T; test++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            bw.write((N + M) + "\n"); // 두 정수를 더한 결과를 출력
        }
        bw.flush();
        bw.close();
        br.close();
    }
}