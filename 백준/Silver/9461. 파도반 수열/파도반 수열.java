import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] arr = new long[101];
        int T = Integer.parseInt(br.readLine());
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        // 1,1,1,2,2,3,4,5,6,9에서 보면 해당 수의 값은 두번째세번째전의 수의 합이다.
        for(int i=4; i<101; i++){
            arr[i] = arr[i-3] + arr[i-2];
        }
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[n]);
        }
        br.close();
    }
}

