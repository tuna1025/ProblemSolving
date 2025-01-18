import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        HashSet set = new HashSet(); //중복 제거용
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }//배열, 집합에 값 추가
        //int[] arr2 = arr  얕은복사라 쓰면 안됌

        ArrayList<Integer> list = new ArrayList(set);//중복제거한거 저장용
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            hm.putIfAbsent(list.get(i), i);
        }
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            bw.write(hm.get(key)+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}