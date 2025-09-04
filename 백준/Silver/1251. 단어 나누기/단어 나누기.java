import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<String> list = new ArrayList<String>();
        for (int i = 2; i < s.length(); i++) {
            for (int j = 1; j <i; j++) {
                String s1 = new StringBuilder(s.substring(0, j)).reverse().toString();
                String s2 = new StringBuilder(s.substring(j,i)).reverse().toString();
                String s3 = new StringBuilder(s.substring(i)).reverse().toString();
                list.add(s1+s2+s3);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }

}
