import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        long total = a * b;
        long ans = Long.MAX_VALUE;
        
        // 가로로 자르기
        long cutA = a / 2;
        ans = Math.min(ans, Math.abs(total - 2 * cutA * b));
        ans = Math.min(ans, Math.abs(total - 2 * (cutA + 1) * b));
        
        // 세로로 자르기
        long cutB = b / 2;
        ans = Math.min(ans, Math.abs(total - 2 * a * cutB));
        ans = Math.min(ans, Math.abs(total - 2 * a * (cutB + 1)));
        
        System.out.println(ans);
    }
}