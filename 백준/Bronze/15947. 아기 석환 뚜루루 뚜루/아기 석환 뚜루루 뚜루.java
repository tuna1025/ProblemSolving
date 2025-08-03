import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] arr = {
                "baby", "sukhwan", "tururu", "turu",
                "very" ,"cute", "tururu", "turu",
                "in", "bed", "tururu", "turu",
                "baby", "sukhwan"
        };
        int repeat = (n-1)/14;
        int position = (n-1) %14;

        String word = arr[position];

        if(word.equals("tururu")) {

            if(repeat >=3){
                System.out.printf("tu+ru*%d", repeat+2);
                return;
            }
            else {
                sb.append(word);
                for(int i = 0; i < repeat; i++){
                    sb.append("ru");
                }
            }
        }
        else if(word.equals("turu")) {

            if(repeat >=4){
                System.out.printf("tu+ru*%d", repeat+1);
                return;
            }
            else {
                sb.append(word);
                for(int i = 0; i < repeat; i++){
                    sb.append("ru");
                }
            }
        }
        else{
            sb.append(word);
        }
        System.out.println(sb);

    }
}
