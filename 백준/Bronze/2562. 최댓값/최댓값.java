import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 9;
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE; //-2147000000
        int index = 0;




        for (int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(br.readLine());
            arr[i] = a;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = Math.max(max, arr[j]);
                index = j+1;
            }
        }
        bw.write(max + "\n");
        bw.write(index + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
