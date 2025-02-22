import java.util.*;
import java.io.*;
class Main {
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 배열을 크기 2^(N-1) × 2^(N-1)
        int r = Integer.parseInt(st.nextToken()); // 행, 세로위치
        int c = Integer.parseInt(st.nextToken()); // 열, 가로위치
        int size = (int)Math.pow(2,N);//한변의 길이

        find(size * size, r, c);
        System.out.println(cnt);

    }

    public static void find(int size, int r, int c){
        if (size == 1){
            return;
        } //더이상 나눌 수 없으면 중지
        if (r < size/2 && c < size/2){
            find(size/2, r, c); // 크기는 4분의 1이 되므로 1변의 길이인 size를 2로 나눔
        }//좌측 상단, 시작위치는 좌측 상단에 있기 때문에 이 경우 움직인 횟수는 세지않음
        else if (r < size/2 && c >= size/2){
            cnt += size * size / 4; //왼쪽상단 만큼 움직인 횟수를 더해줌.
            find(size/2, r, c - size/2); // 가로 길이인 c를 한변의 반만큼 빼줘서 상대위치 업데이트
        }//우측 상단
        else if (r>=size/2 && c < size/2){
            cnt += (size * size / 4) * 2; // 사분면 2개만큼 이동함
            find(size/2, r - size/2, c); // 세로길이인 r을 한변의 반만큼 빼줘서 상대 위치 업데이트
        }//좌측 하단
        else {
            cnt += (size * size / 4) * 3; // 사분면 3개만큼 이동
            find(size/2, r - size/2, c - size/2); // 가로세로다뺴줘서 위치 업데이트
        }//우측 하단
    }
}