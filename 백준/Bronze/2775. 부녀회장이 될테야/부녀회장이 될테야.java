import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[][] apart = new int[15][15];
        for (int j = 1; j < 15; j++) {
            apart[0][j] = j;
            apart[j][1] = 1;
        }//0층과 다른층 1호실 채워주기
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                apart[i][j] = apart[i-1][j] + apart[i][j-1];
            }
        }
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            bw.write(apart[n][k] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}


