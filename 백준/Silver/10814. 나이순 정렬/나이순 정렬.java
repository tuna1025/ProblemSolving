import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        String[][] str = new String[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }
        Arrays.sort(str, (str1,str2) ->{
            if (str1[0].equals(str2[0])) {
                return 0; // 순서가 같으면 그대로 두기
            }
            return Integer.parseInt(str1[0]) - Integer.parseInt(str2[0]); //나이순으로 정렬
        });

        for (int i = 0; i < n; i++) {
            sb.append(str[i][0] + " " + str[i][1] + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}