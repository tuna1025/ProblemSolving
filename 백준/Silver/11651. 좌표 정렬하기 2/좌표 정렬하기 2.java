import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 100,000이하
        int[][] arr = new int[n][2]; // x, y값을 저장할 2차원 배열

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr,(arr1,arr2) ->{
            if (arr1[1] == arr2[1]){
                return arr1[0] - arr2[0]; 
            }
            return arr1[1] - arr2[1];
        }); // arr[0]은 x arr[1]은 y


        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }// 버퍼에 문자열 쌓기
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}