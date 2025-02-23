import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 회의 정보를 저장할 리스트
        List<int[]> meetings = new ArrayList<>();

        int n = Integer.parseInt(br.readLine()); // 회의의 수 입력

        // 회의 정보를 입력받아 리스트에 저장
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 시작 시간
            int b = Integer.parseInt(st.nextToken()); // 끝나는 시간
            meetings.add(new int[]{a, b});
        }

        // 회의 정보를 끝나는 시간 기준으로 정렬
        meetings.sort((a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        }); // 만약 끝나는 시간이 같다면 시작시간이 작은게 앞으로 감

        int endTime = 0; // 마지막으로 선택된 회의의 끝나는 시간
        int cnt = 0; // 선택된 회의의 개수

        // 회의 정보를 순회하면서 회의 선택
        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            if (start >= endTime){
                cnt++;
                endTime = end; //끝나는 시간 갱신
            }
        }// 빨리 끝나는거 순으로 개수 세기

        // 최대 사용할 수 있는 회의의 개수 출력
        System.out.println(cnt);
    }
}