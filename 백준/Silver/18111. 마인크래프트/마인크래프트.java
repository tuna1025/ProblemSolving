import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());//행
        int m = Integer.parseInt(st.nextToken());//열
        long b = Long.parseLong(st.nextToken());//인벤토리 블록의 수,최대 6.4 × 10^7
        int[][] arr = new int[n][m];
        int min = Integer.MAX_VALUE;//블록 높이 최저치 확인용
        int max = Integer.MIN_VALUE;//블록 높이 최대치 확인용
        int time = Integer.MAX_VALUE;//최소시간 확인용
        int height = 0;//블록높이 확인용

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, arr[i][j]);
                max = Math.max(max, arr[i][j]);
            }
        }// 배열에 전체 블록 높이 넣으면서 블록 최대치 최소치 확인

        for (int i = min; i <= max; i++) {
            int cnt = 0;
            long block = b;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (arr[j][k] >= i) {
                        cnt += (arr[j][k] - i)*2;//지운 블록만큼 시간 추가//인벤꺼내서 설치하면 시간 2배
                        block += arr[j][k] - i;// 인벤에서 설치한 블록만큼 빼기
                    }//현재 높이가 i보다 작으면 인벤에서 블록 꺼내서 설치
                    else {
                        cnt += i-arr[j][k];//지운 블록만큼 시간 추가
                        block -= i-arr[j][k]; //지운 블록만큼 인벤에 블록추가
                    }//현재 높이가 i보다 크면 블록제거 후 인벤에 넣기
                }
            }
            if(block < 0) continue; // 블록이 음수면 갱신 안하고 다음 수로 넘어가기
            
            if(time>=cnt){
                if(time == cnt){
                    height = Math.max(height, i);
                }//시간이 같을때 높은블록으로 출력
                else {
                    height = i;
                }
                time=cnt;
            }
        }//min~max범위에서 최소시간 확인하기

        System.out.print(time+" "+height);
        br.close();
    }
}
