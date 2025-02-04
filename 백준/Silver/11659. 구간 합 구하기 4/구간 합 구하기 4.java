import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); //숫자 개수
        int m = Integer.parseInt(st.nextToken()); // 누적합 개수
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n+1];
        arr[0] = 0;
        for (int i = 1; i < n+1; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }//누적합, 이전꺼의 합 + 다음수

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            bw.write(arr[e] - arr[s-1] + "\n");
        }//e번째까지의 합 - (s-1)의 합 = s부터 e번째까지의 합

        bw.flush();
        bw.close();
        br.close();
    }
}

