import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[41][2];
        arr[0][0] = 1;
        arr[1][0] = 0;
        arr[0][1] = 0;
        arr[1][1] = 1;
        //초기값
        for (int j = 2; j < 41; j++) {
            arr[j][0] = arr[j-1][0] + arr[j-2][0];
            arr[j][1] = arr[j-1][1] + arr[j-2][1];
        }
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(arr[N][0] + " " + arr[N][1]);
        }
        br.close();
    }
}

