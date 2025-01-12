import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        int a,b;
        /*
        1/1             1개
        1/2 2/1         분모 1증가 분자 1감소 2개
        3/1 2/2 1/3     분모 1감소 분자 1증가 3개
        1/4 2/3 3/2 4/1 분모 1증가 분자 1감소 4개
        */
        while (n > cnt) {
            n -= cnt;
            cnt++;
        }//몇번째 줄에 있는지 확인
        
        if (cnt % 2 == 1) {
            a = cnt - n + 1;
            b = n;
        }
        else {
            b = cnt - n + 1;
            a = n;
        }
        System.out.println(a + "/" + b);
    }
}

