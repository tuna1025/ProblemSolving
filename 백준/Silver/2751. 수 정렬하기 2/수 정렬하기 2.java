import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            list.add(a);
        }
        Collections.sort(list);// collectionSort는 시간복잡도가 최악의 경우도 nlogn이다.
        for(int i : list) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}