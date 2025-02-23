import java.util.*;
import java.io.*;

class Main {
    static int white = 0; // 하얀 종이의 개수
    static int blue = 0; // 파란 종이의 개수
    static int[][] paper; // 종이 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int size = Integer.parseInt(br.readLine()); // 한 변의 길이
        paper = new int[size][size]; // 종이 배열 초기화

        // 종이 배열을 입력받음
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        findPaper(size, 0, 0); // 종이 자르기 시작

        System.out.println(white); // 하얀 종이의 개수 출력
        System.out.println(blue); // 파란 종이의 개수 출력
    }

    // 종이를 찾는 메서드
    static void findPaper(int size, int row, int col) {
        int nextSize = size / 2; // 다음 크기 (절반)

        // 현재 영역이 동일한 색상인지 확인
        if (colorChecker(size, row, col)) {
            if (paper[row][col] == 0) {
                white++; // 하얀 종이 개수 증가
            } else {
                blue++; // 파란 종이 개수 증가
            }
            return; // 더 이상 탐색할 필요 없기 때문에 재귀 종료
        }

        // 영역을 4등분하여 재귀적으로 탐색
        findPaper(nextSize, row, col); // 왼쪽 위
        findPaper(nextSize, row + nextSize, col); // 왼쪽 아래
        findPaper(nextSize, row, col + nextSize); // 오른쪽 위
        findPaper(nextSize, row + nextSize, col + nextSize); // 오른쪽 아래
    }

    // 주어진 영역이 동일한 색상인지 확인하는 메서드
    static boolean colorChecker(int size, int row, int col) {
        int temp = paper[row][col]; // 기준 색상
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (paper[i][j] != temp) {
                    return false; // 다른 색상이 있으면 false 반환
                }
            }
        }
        return true; // 모든 색상이 동일하면 true 반환
    }
}
