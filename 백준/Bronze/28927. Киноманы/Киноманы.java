import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sumMax = Integer.parseInt(st.nextToken())*3 + Integer.parseInt(st.nextToken())*20 + Integer.parseInt(st.nextToken())*120;
        st = new StringTokenizer(br.readLine());
        int sumMel = Integer.parseInt(st.nextToken())*3 + Integer.parseInt(st.nextToken())*20 + Integer.parseInt(st.nextToken())*120;
        if(sumMax > sumMel) {
            System.out.println("Max");
        }
        else if(sumMel > sumMax) {
            System.out.println("Mel");
        }
        else {
            System.out.println("Draw");
        }
    }
}
