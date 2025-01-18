import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }// 중복단어 제거
        for (String s : set) {
            list.add(s);
        }//리스트에 추가
        Collections.sort(list, (String a, String b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b); // a,b를 사전순으로 비교
            }
            return a.length() - b.length(); // 길이별로 비교
        });

        for (String s : list) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}