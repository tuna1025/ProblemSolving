import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /*
        타일이 1개일때 1
        타일이 2개일때 2
        타일이 3개일때 3
        타일이 4개일때 5
        타일이 5개일때 8
        피보나치인가?
         */
        if(n==1){
            System.out.println(1);
            return;
        }
        else if(n==2){
            System.out.println(2);
            return;
        }
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for(int i=3;i<=n;i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;
        }
        System.out.println(arr[n]);
        br.close();
    }
}