import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BigInteger limit = new BigInteger("10").pow(100);
        ArrayList<BigInteger> fib = new ArrayList<>();
        fib.add(new BigInteger("1"));
        fib.add(new BigInteger("2"));

        while(true){
            BigInteger n = fib.get(fib.size() - 1).add(fib.get(fib.size() - 2));
            if(n.compareTo(limit)>0) break; // n이 limit보다 커지면 1 반환되서 break
            fib.add(n);
        }// 10^100까지 미리 피보나치 연산

        while(true){
            st = new StringTokenizer(br.readLine());
            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());

            if(a.compareTo(BigInteger.ZERO) == 0 && b.compareTo(BigInteger.ZERO) == 0) break; // 0 0일때 EOF

            int cnt = 0;
            for(BigInteger i : fib){
                if(i.compareTo(a)<0) continue; // a보다 작으면 건너뛰기
                if(i.compareTo(b)>0) break;    // b보다 커지면 비교 중지
                cnt++; //a<i<b 일때 개수 증가
            }
            System.out.println(cnt);
        }
    }
}
