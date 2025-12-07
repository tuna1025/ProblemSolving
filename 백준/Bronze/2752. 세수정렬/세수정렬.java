import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> arr = new ArrayList<>();
        while (st.hasMoreTokens()) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        for (int i: arr){
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}