import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());

            if(a == 1){
                sb.append("#\n\n");
            }
            else{
                for (int j = 0; j < a; j++) {
                    sb.append("#");
                }
                sb.append("\n");
                for (int j = 0; j < a-2; j++) {
                    sb.append("#");
                    for (int k = 0; k < a-2; k++) {
                        sb.append("J");
                    }
                    sb.append("#\n");
                }
                for (int j = 0; j < a; j++) {
                    sb.append("#");
                }
                sb.append("\n\n");
            }
        }

        System.out.println(sb);
    }
}
