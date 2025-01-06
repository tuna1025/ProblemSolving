import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }// hasMoreTokens()는 다음토큰이 있는지만 확인해주기 때문에 nextToken을 반복구문 안에 넣어줘야됨

        System.out.println(count);

        br.close();
    }

}
