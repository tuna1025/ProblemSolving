import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] xArr = new int[3];
        int[] yArr = new int[3];
        int a,b;
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            xArr[i] = Integer.parseInt(st.nextToken());
            yArr[i] = Integer.parseInt(st.nextToken());
        }//배열에 입력받은거 저장
        if(xArr[0] == xArr[1]) a = xArr[2];
        else if(xArr[0] == xArr[2]) a = xArr[1];
        else a = xArr[0];

        if(yArr[0] == yArr[1]) b = yArr[2];
        else if(yArr[0] == yArr[2]) b = yArr[1];
        else b = yArr[0];

        System.out.println(a+" "+b);
        br.close();
    }
}

