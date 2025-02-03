import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //점화식: 주어진 수 = 제곱근 + 나머지수
        //dp[i] = dp[j*j] + dp[i-j*j]?
        //dp[j*j] = 1로 고정
        //예외 dp8 = 2^2 + 2^2로 2개이다. 떄문에 추가적인거? 흠... 제곱수인 경우도 넣어서 비교?하면?되나?
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n+1; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j * j < i+1; j++) {
                min = Math.min(min,dp[i - j*j]);
            }// i보다 작거나 같은 제곱근 비교해서 구해주기
            //12일때 j는 1~3까지
            //1일때 dp11의 개수는 3개
            //2일때 dp8의 개수는 2개
            //3일때 dp3의 개수는 3개
            //25일때 j는 1~5까지 올 수 있다.
            //j가 1일때 25 - 1*1 = 24. 24의 개수는 3이다.
            //j가 2일때 25 - 2*2 = 21. 21의 개수는 3이다.
            //j가 3일때 25 - 3*3 = 16. 16의 개수는 1이다.
            //j가 4일때 25 - 4*4 = 9. 9의 개수는 1이다.
            //j가 5일때 25 - 5*5 = 0. 0의 개수는 0이다.
            //최솟값은 0이고, 출력값은 +1인 1이 된다.
            dp[i] = min + 1;
        }
        //아.. dp 넘모 어렵다
        System.out.println(dp[n]);

    }
}
