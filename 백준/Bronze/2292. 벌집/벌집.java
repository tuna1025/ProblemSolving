import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int start = 1;//벌집을 한바퀴 돌때마다 둘러쌀때 필요한 개수(시작과끝)가 +6 +12 +18씩 6의 배수만큼 증가
        int cnt = 1;
        while (n > start) {
            //원하는 숫자가 1을 중심원으로 하는 껍질범위 밖에 있으면 탈출 1, 2~7, 8~19...
            start = start + 6*cnt;
            cnt++;
        }
        System.out.println(cnt);
    }
}

