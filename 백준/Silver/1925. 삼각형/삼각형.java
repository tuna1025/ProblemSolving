import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 세 점의 좌표 입력 받기
        long x1 = sc.nextLong();
        long y1 = sc.nextLong();
        long x2 = sc.nextLong();
        long y2 = sc.nextLong();
        long x3 = sc.nextLong();
        long y3 = sc.nextLong();

        // 2. 세 점이 일직선 위에 있는지 확인 (기울기 비교)
        // (y2 - y1) / (x2 - x1) == (y3 - y2) / (x3 - x2) 를 분수 없이 곱셈으로 표현
        if ((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)) {
            System.out.println("X");
            return;
        }

        // 3. 세 변의 길이의 제곱 계산 (정수 좌표이므로 오차 없는 제곱값 사용)
        long aSq = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        long bSq = (x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2);
        long cSq = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);

        // 4. 변의 길이를 정렬하여 가장 긴 변(Max)을 찾음
        long[] sides = {aSq, bSq, cSq};
        Arrays.sort(sides);
        long L1 = sides[0]; // 가장 짧은 변의 제곱
        long L2 = sides[1]; // 중간 변의 제곱
        long L3 = sides[2]; // 가장 긴 변의 제곱

        // 5. 삼각형 종류 판별 로직
        if (L1 == L2 && L2 == L3) {
            // 모든 변의 길이가 같은 경우
            System.out.println("JungTriangle");
        } else if (L1 == L2 || L2 == L3 || L1 == L3) {
            // 두 변의 길이가 같은 경우 (이등변)
            if (L1 + L2 < L3) {
                System.out.println("Dunkak2Triangle"); // 둔각이등변
            } else if (L1 + L2 == L3) {
                System.out.println("Jikkak2Triangle"); // 직각이등변
            } else {
                System.out.println("Yeahkak2Triangle"); // 예각이등변
            }
        } else {
            // 세 변의 길이가 모두 다른 경우
            if (L1 + L2 < L3) {
                System.out.println("DunkakTriangle"); // 둔각
            } else if (L1 + L2 == L3) {
                System.out.println("JikkakTriangle"); // 직각
            } else {
                System.out.println("YeahkakTriangle"); // 예각
            }
        }

        sc.close();
    }
}