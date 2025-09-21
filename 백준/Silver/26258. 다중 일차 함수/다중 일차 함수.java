import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<point> list = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new point(x, y));
        }
        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            double k = Double.parseDouble(br.readLine());

            int low = 0;
            int high = list.size() - 1;
            int mid = 0;
            while (low < high) {
                mid = (low + high) / 2;
                if(low+1 == high) break;
                if(list.get(mid).x < k) low = mid;
                else high = mid;
            } // 인덱스로 이분탐색 주어진 k값에 대해 사이에 걸쳐있는 x를 찾음
            int y1 = list.get(mid).y;
            int y2 = list.get(mid+1).y;

            if(y1<y2) System.out.println("1");
            else if(y1>y2)System.out.println("-1");
            else System.out.println("0");

        }
    }

    public static class point{
        int x;
        int y;
        public point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}