import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int train = Integer.parseInt(st.nextToken());
        int fly = Integer.parseInt(st.nextToken());
        int dis = Integer.parseInt(st.nextToken());
        //기차가 이동한 거리의 시간 = 파리가 이동한 시간
        //파리가 이동한 시간 * 속도 = 파리가 이동한 거리
        System.out.println((dis / (train*2))*fly);
    }
}