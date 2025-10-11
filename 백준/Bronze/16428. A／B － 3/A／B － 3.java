import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger numA = new BigInteger(st.nextToken());
        BigInteger numB = new BigInteger(st.nextToken());

        // numA와 numB가 음,양수일 때를 나눠 출력한다.
        if (numA.compareTo(BigInteger.ZERO) == -1 && numB.compareTo(BigInteger.ZERO) == -1){
            BigInteger answerA = numA.divide(numB).add(BigInteger.ONE);
            BigInteger answerB = numA.remainder(numB).subtract(numB);

            sb.append(answerA).append("\n");
            sb.append(answerB).append("\n");
        }else if(numA.compareTo(BigInteger.ZERO) == -1 && numB.compareTo(BigInteger.ZERO) == 1){
            BigInteger answerA = numA.divide(numB).subtract(BigInteger.ONE);
            BigInteger answerB = numA.remainder(numB).add(numB);

            sb.append(answerA).append("\n");
            sb.append(answerB).append("\n");
        }else{
            BigInteger answerA = numA.divide(numB);
            BigInteger answerB = numA.remainder(numB);

            sb.append(answerA).append("\n");
            sb.append(answerB).append("\n");
        }

        System.out.println(sb.toString());


    }
}