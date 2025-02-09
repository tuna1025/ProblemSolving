import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] tree = new int[n];
        int max = 0;
        int min = 0;


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (max < tree[i]) {
                max = tree[i];
            }
        }//나무 높이 배열에 넣으면서 자를 높이 최대치 구하기

        while (min <= max) {
            long sum = 0; //나무 하나의 높이가 최대 1,000,000,000이기 때문데 long 사용
            int mid = (min + max) / 2;//자를높이
            for (int i = 0; i < n; i++) {
                if(tree[i] > mid) {
                    sum += tree[i]-mid;
                }
            }//자른 높이만큼 총합에 더해줌
            if(sum >= m) {
                min = mid+1;
            }//총합이 높으면 자르는 높이 올려줌, 중복되는 경우를 제외해주기 위해 평균에 1더해주고 갱신
            else{
                max = mid-1;
            }//총합이 낮으면 자르는 높이 낮춤

        }

        System.out.println(max);

        br.close();
    }
}
