import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int days;
        int move = A-B;

        days = V/move;
        if ((V%move + move) <= A){
            days -= A/move;
            days++;
        }// 낮동안 정상까지 올랐을때
        else if (V%move == 0) {

        }
        else days++; //못올랐을때


        System.out.println(days);
        br.close();
    }
}

