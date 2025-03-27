import java.io.*;
import java.util.*;
public class Main {
    static int N,cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        cnt = 0;
        int[][] board = new int[N][N];
        nQueen(board,0);
        System.out.println(cnt);
    }
    static void nQueen(int[][] board, int row) {
        if (row == N){ // 모든행에 퀸을 배치한 경우 성공
            cnt++;
            return;
        }

        // 해당 행에서 모든 영에 대해 탐색
        for (int i = 0; i < N; i++) {
            //퀸이 공격할 수 있는 루트 조건 검사
            if(!isSafe(board, row, i)) continue;

            board[row][i] = 1;
            nQueen(board, row + 1);
            board[row][i] = 0;
        }
    }
    private static boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;

        // 같은 열에 다른 퀸이 있는지 확인
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // 왼쪽 대각선에 다른 퀸이 있는지 확인
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // 오른쪽 대각선에 다른 퀸이 있는지 확인
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }


}