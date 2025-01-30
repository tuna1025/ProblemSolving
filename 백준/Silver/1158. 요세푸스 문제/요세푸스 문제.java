import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int index = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }
        while (!list.isEmpty()) {
            index = (index + k -1) % list.size();// k만큼 인덱스 이동후 listSize넘기면 초기화,이거 기억해두면 좋을듯
            list2.add(list.remove(index)); // 반환후 list 2에 더해주기
        }
        String s = list2.toString();

        System.out.println("<" + s.substring(1, s.length() - 1) + ">");
    }
}