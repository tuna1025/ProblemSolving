import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        // 부품 가격
        BigDecimal blaster = new BigDecimal("350.34");
        BigDecimal vision = new BigDecimal("230.90");
        BigDecimal hearing = new BigDecimal("190.55");
        BigDecimal arm = new BigDecimal("125.30");
        BigDecimal leg = new BigDecimal("180.90");

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            BigDecimal total = BigDecimal.ZERO;

            total = total.add(blaster.multiply(BigDecimal.valueOf(A)));
            total = total.add(vision.multiply(BigDecimal.valueOf(B)));
            total = total.add(hearing.multiply(BigDecimal.valueOf(C)));
            total = total.add(arm.multiply(BigDecimal.valueOf(D)));
            total = total.add(leg.multiply(BigDecimal.valueOf(E)));

            sb.append("$").append(total.setScale(2)).append("\n");
        }

        System.out.print(sb.toString());
    }
}
