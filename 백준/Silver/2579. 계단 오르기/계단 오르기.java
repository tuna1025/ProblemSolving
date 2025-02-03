import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        int[] list = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }// 계단 점수 입력

        //case 1 계단이 2개이하 일 때 0은 편의상 건너뜀
        dp[1] = list[1];
        if (n >= 2) {
            dp[2] = list[2] + list[1];
        }
        //case 2 n-3, n-1을 밝고 n번째 계단
        //case 3 n-2번째 n번째 계단 case 2,3중 큰값하고 n째 계단더하기
        for (int i = 3; i < n+1; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3]+list[i-1])+list[i];
        }//어렵눙

        System.out.println(dp[n]);
        br.close();
    }
}
