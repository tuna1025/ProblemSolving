import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++) arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        
        int a = arr[0], b = arr[1], c = arr[2];
        
        boolean right = (a*a + b*b == c*c);
        boolean equi = (a == b && b == c);
        
        if(right) System.out.println(1);
        else if(equi) System.out.println(2);
        else System.out.println(0);
    }
}