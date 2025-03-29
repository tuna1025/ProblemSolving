import java.util.*;
import java.io.*;
public class Main {
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();
        dp = new int[arr1.length + 1][arr2.length + 1];

        //테이블 그리기
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

        //대각선에서 +1되는 경우만 문자열에 넣어주면됨 뒤에서부터 추적
        //위랑 같은 수면 위로한칸이동 왼쪽이랑 같으면 왼쪽으로 이동 아니면 대각으로 이동
        Stack<Character> stack = new Stack<>();
        int x = arr1.length;
        int y = arr2.length;
        while(x > 0 && y > 0) {

            if(arr1[x-1] == arr2[y-1]) {
                stack.push(arr1[x-1]);
                x-=1;
                y-=1;
            }
            else if(dp[x-1][y] == dp[x][y]) { // 왼쪽값과 같다
                x-=1;
            }
            else { // 윗쪽값과 같다.
                y-=1;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(dp[arr1.length][arr2.length]);
        System.out.println(sb.toString());


    }
}