import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();
        int chikenCnt = 0, anotherCnt = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'C') {
                chikenCnt += 1;
            } else {
                anotherCnt += 1;
            }
        }
        int ans = chikenCnt/(anotherCnt+1); // 4개에 1개면 최대값2 3개면 2, +1하고 올림? 0되면 오류나니까
        //7
        //CCHCCCK일 떄처럼 예외처리
        if (anotherCnt > 0 && chikenCnt % (anotherCnt+1) != 0) {
            ans += 1;
        }
        System.out.println(ans);
    }

}