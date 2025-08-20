import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i: list) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        if(min == list.get(0)){
            System.out.println("ez");
        } else if (max == list.get(0)) {
            System.out.println("hard");
        }
        else{
            System.out.println("?");
        }
    }
}
