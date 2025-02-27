import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        for(int i = 0; i< 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j< 4; j++){
                if(Integer.parseInt(st.nextToken()) == 1)cnt++;
            }
            if(cnt == 0) System.out.println("D");
            else if(cnt == 1) System.out.println("C");
            else if(cnt == 2) System.out.println("B");
            else if(cnt == 3)System.out.println("A");
            else System.out.println("E");
            cnt = 0;
        }
        br.close();
    }
}