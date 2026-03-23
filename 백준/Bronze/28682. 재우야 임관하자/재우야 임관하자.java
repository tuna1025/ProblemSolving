import java.io.*;
import java.util.*;

public class Main {

    static String[] subjects = {"swimming", "bowling", "soccer"};

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 처음 선택
        StringBuilder first = new StringBuilder();
        for(int i=0;i<n;i++){
            first.append("swimming");
            if(i<n-1) first.append(" ");
        }

        System.out.println(first);
        System.out.flush();

        //  교수 입력
        String[] professor = br.readLine().split(" ");

        // 최종 선택
        StringBuilder result = new StringBuilder();

        for(int i=0;i<n;i++){

            String firstPick = "swimming";
            String opened = professor[i];

            for(String s : subjects){
                if(!s.equals(firstPick) && !s.equals(opened)){
                    result.append(s);
                    break;
                }
            }

            if(i<n-1) result.append(" ");
        }

        System.out.println(result);
        System.out.flush();
    }
}