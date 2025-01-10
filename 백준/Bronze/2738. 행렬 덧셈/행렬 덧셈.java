import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];
        int[][] result = new int[N][M];
        int a = 0;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                a = Integer.parseInt(st.nextToken());
                arr1[i][j] = a;
            }
        }//첫번째 행렬 배열에 채우기
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                a = Integer.parseInt(st.nextToken());
                arr2[i][j] = a;
            }
        }//2번째 행렬 채우기
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }//행렬1,2합친거 기록
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(result[i][j] + " ");;
            }
            System.out.println();
        }

        br.close();
    }
}