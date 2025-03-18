import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();
        int[][] dp = new int[arr1.length + 1][arr2.length + 1];

        for(int i=1;i <= arr1.length;i++){
            for(int j=1;j <= arr2.length;j++){
                if(arr1[i-1] == arr2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }// 문자열이 같은경우 왼쪽대각선위의 누적숫자 + 1
        // 문자열이 다른경우 위쪽 왼쪽중에서 큰 숫자
        
        // 문제 푸려고 위키까지 찾아봐야하냐.. ㅠㅠ dp는 적응이 안되네

        int max = Integer.MIN_VALUE;

        for(int i=1;i<=arr1.length;i++){
            for(int j=1;j<=arr2.length;j++){
                max = Math.max(max,dp[i][j]);
            }
        }
        System.out.println(max);
    }
}