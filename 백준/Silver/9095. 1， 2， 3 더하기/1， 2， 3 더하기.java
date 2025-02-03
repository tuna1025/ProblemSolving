import java.io.*;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        /*패턴
        * 1일때 1
        * 2일때 2
        * 3일때 4 1+1+1, 2+1, 1+2, 3
        * 4일때 7 1일떄 2일때 3일때 1 + 2 + 4?
        * 5일때 13 1+1+1+1+1,2+1+1+1 4개 2+2+1 3개 + 3+1+1 3개 + 2+3 2개 */
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            int[] dp = new int[12];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for (int j = 4; j < a+1; j++) {
                if (a == 1){
                    System.out.println(1);
                    break;
                }
                else if (a == 2){
                    System.out.println(2);
                    break;
                }
                else if (a == 3){
                    System.out.println(4);
                    break;
                }

                dp[j] = dp[j-3] + dp[j-2] + dp[j-1];
            }
            System.out.println(dp[a]);
        }
        br.close();
    }
}

