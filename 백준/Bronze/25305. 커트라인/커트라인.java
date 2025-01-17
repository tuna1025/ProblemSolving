import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n;i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);// collectionSort는 시간복잡도가 최악의 경우도 nlogn이다.
        System.out.println(list.get(list.size()- k));
        br.close();
    }
}