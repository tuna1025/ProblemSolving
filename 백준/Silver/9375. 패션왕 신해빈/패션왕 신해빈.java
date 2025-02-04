import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                st.nextToken();
                String s = st.nextToken();
                if (!map.containsKey(s)) {
                    map.put(s,2);
                }
                else {
                    map.put(s,map.get(s)+1);
                }// 옷의 종류별로 개수 세기, 초기값이 2인이유는 옷을 벗고 있는 경우도 포함
            }
            int sum = 1;
            for (int k:map.values()) {
                sum *= k;
            }//경우의수 곱해주기
            System.out.println(sum-1); // 다 벗고있는경우 제외
            map.clear();
        }
    }
}