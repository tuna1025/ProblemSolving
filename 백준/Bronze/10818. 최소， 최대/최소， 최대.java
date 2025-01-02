import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE; //-2147000000
        int min = Integer.MAX_VALUE;//  2147000000

        StringTokenizer st = new StringTokenizer(br.readLine());


        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        for (int j = 0; j < arr.length; j++) {
            max = Math.max(max, arr[j]);
            min = Math.min(min, arr[j]);
        }
        bw.write(min + " " + max + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
