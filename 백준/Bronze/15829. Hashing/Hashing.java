import java.io.*;
import java.math.BigInteger;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s = br.readLine();
        BigInteger b = new BigInteger("0");//0으로 초기화
        for (int i = 0; i < t; i++) {
            b = b.add(BigInteger.valueOf(s.charAt(i)-96).multiply(BigInteger.valueOf(31).pow(i)));
        }// 'a'는 97, b에 알파벳의 해당하는 1~26사이의 값에 31의 (문자열길이)승만큼의 제곱수 곱해줌
        System.out.println(b);
    }
}

