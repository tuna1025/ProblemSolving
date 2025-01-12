import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int remain = 0;
        char[] arr = new char[30];
        int index = 0;
        while (n != 0) {
            remain = n%m; //나머지
            n = n/m; //몫
            if (remain < 10) {
                arr[index] = (char)(remain + '0');
            }
            else {
                arr[index] = (char)(remain - 10 + 'A');
            }
            index++;
        }
        for (int i = index-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}

