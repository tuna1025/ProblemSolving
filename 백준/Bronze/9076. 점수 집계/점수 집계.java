import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수
        
        for (int t = 0; t < T; t++) {
            int[] scores = new int[5];
            for (int i = 0; i < 5; i++) {
                scores[i] = sc.nextInt();
            }
            
            Arrays.sort(scores); // 점수 오름차순 정렬
            
            int min = scores[0];       // 최저점
            int max = scores[4];       // 최고점
            int[] middleThree = Arrays.copyOfRange(scores, 1, 4); // 중간 3점
            
            int middleMin = middleThree[0];
            int middleMax = middleThree[2];
            
            if (middleMax - middleMin >= 4) {
                System.out.println("KIN");
            } else {
                int total = middleThree[0] + middleThree[1] + middleThree[2];
                System.out.println(total);
            }
        }
        
        sc.close();
    }
}
