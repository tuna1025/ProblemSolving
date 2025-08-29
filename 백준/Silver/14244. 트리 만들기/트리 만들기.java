import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int lastLeaf = 0; // 가장 최근의 leaf
        int cnt = 0; //leaf의 개수

        if (m==2) cnt = 1; //리프가 2개인 경우 루트노드도 리프 취급?

        for (int i = 1; i < n; i++) {
            if (cnt < m) {
                System.out.println(0+" "+ i);
                cnt++;
            } // leaf만들고 시작
            else System.out.println(lastLeaf+" "+i);
            lastLeaf = i;
        }

    }
}
