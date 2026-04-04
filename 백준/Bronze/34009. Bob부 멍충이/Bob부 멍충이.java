import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i = 0; i < N; i++) sc.nextInt(); // 값은 필요 없음
        
        if(N % 2 == 0) System.out.println("Alice");
        else System.out.println("Bob");
    }
}