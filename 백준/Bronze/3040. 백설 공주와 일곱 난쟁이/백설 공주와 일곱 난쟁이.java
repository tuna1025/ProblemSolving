import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        for(int i = 0; i< 8; i++){
            for(int j = i+1; j < 9; j++){
                if(sum - (arr[i]+arr[j]) == 100){
                    for(int k = 0; k < 9; k++){
                        if(k != i && k != j){
                            System.out.println(arr[k]);
                        }
                    }
                }
            }
        }
    }
}