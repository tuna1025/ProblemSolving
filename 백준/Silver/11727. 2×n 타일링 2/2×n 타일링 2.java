import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /*
        타일이 1개일때 1
        타일이 2개일때 3
        타일이 3개일때 5
        타일이 4개일때 11
        a1 = 1 a2= 3 a3 = 5 a4 = 11
        a3 = a1*2 + a2, a4 = a2*2 + a3?
         */
        if(n==1){
            System.out.println(1);
            return;
        }
        else if(n==2){
            System.out.println(3);
            return;
        }
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 3;
        for(int i=3;i<=n;i++) {
            arr[i] = (arr[i-1] + arr[i-2]*2) % 10007;
        }
        System.out.println(arr[n]);
        br.close();
    }
}