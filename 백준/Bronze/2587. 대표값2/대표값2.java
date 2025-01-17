import java.io.*;
import java.util.ArrayList;
import java.util.Collections;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            sum += a;
            list.add(a);
        }
        Collections.sort(list);// collectionSort는 시간복잡도가 최악의 경우도 nlogn이다.

        System.out.println(sum/5);
        System.out.println(list.get(2));
        br.close();
    }
}