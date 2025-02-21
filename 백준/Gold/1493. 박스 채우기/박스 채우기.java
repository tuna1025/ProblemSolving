import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int L = Integer.parseInt(st.nextToken()); // 박스의 길이
        int W = Integer.parseInt(st.nextToken()); // 박스의 너비
        int H = Integer.parseInt(st.nextToken()); // 박스의 높이

        int N = Integer.parseInt(br.readLine()); // 큐브의 종류 수

        int[] cube = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken()); // 큐브의 크기 (2^t)
            int f = Integer.parseInt(st.nextToken()); // 큐브의 개수
            cube[t] = f;
        }

        long before = 0; // 이전에 사용된 큐브의 개수
        long ans = 0; // 필요한 큐브의 총 개수
        for (int i = N - 1; i >= 0; i--) { // 큰 큐브부터 작은 큐브로 반복
            before <<= 3; // 큐브 크기 감소에 따라 이전 큐브 개수를 8배로 늘림 (2^3 = 8)
            long possibleCube = (long) (L >> i) * (W >> i) * (H >> i) - before; // 현재 큐브 크기에서 채울 수 있는 최대 큐브 개수
            long newCube = Math.min((long) cube[i], possibleCube); // 실제로 추가할 수 있는 큐브 개수
            before += newCube; // 현재 큐브 크기에서 추가된 큐브 개수를 이전 큐브 개수에 더함
            ans += newCube; // 총 큐브 개수에 추가
        }

        if (before == (long) L * W * H) { // 채워진 큐브의 총 부피가 박스의 부피와 같으면
            bw.write(ans + "\n"); // 필요한 큐브의 총 개수를 출력
        } else { // 채워진 큐브의 총 부피가 박스의 부피와 다르면
            bw.write("-1\n"); // 불가능함을 출력
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
