import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cost = Integer.MAX_VALUE;
        String board[] = new String[n];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine();
        }
        //8x8덩어리로 한칸씩 이동
        for(int i = 0; i <= n-8; i++) {
            for(int j = 0; j <= m-8; j++) {
                if(cost > checkCost(i, j, board)) cost = checkCost(i, j, board);
            }// 코스트가 최소면 갱신
        }
        System.out.println(cost);
        br.close();
    }
    //8x8체스판에서 교체 최소비용구하기
    public static int checkCost(int row, int col, String[] board){
        int startRow, startCol;
        int cost = 0;
        String[] check = new String[]{"WBWBWBWB","BWBWBWBW"};//정상체스판패턴
        for(int i = 0; i < 8; i++) {
            startRow = row + i;//시작좌표부터 8칸까지 탐색
            for(int j = 0; j < 8; j++) {
                startCol = col + j;
                if (board[startRow].charAt(startCol) != check[i%2].charAt(j)) {
                    cost++;
                }//i번째 행에서 j번째 열에있는 문자가 원래 패턴의 j번째 문자열과 다르면 cost증가
                // i%2를사용해서 행이 변할떄마다 패턴을 바꿔줌
            }
        }
        //검은색으로 시작하는경우도 있어야됨
        return Math.min(cost, 64-cost);
    }
}