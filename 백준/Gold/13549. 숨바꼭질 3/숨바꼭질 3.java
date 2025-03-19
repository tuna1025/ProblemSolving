import java.io.*;
import java.util.*;
public class Main {
    static int[] map = new int[1000001];
    static boolean[] visited = new boolean[1000001];
    static int N,K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 수빈이 위치
        K = Integer.parseInt(st.nextToken()); // 잡아야하는 동생 위치

        System.out.println(bfs(N));
        br.close();
    }

    static int bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;

        while (!q.isEmpty()) {
            int position = q.poll();

            if(position == K) return map[position];

            // 현제 위치의 2배 만큼 순간이동시 0초 추가, 이 경우 비용이 없기 때문에 맨앞에 둬야함
            if (position * 2 <= 100000 &&!visited[position * 2]) {
                q.add(position*2);
                visited[position*2] = true;
                map[position*2] = map[position];
            }// 이전 위치의 누적시간 그대로

            // 뒤로 한칸 이동 시 1초 추가, 이게 두번쨰로 와야됨, 
            // 더하는 경우가 앞에 오면 더 짧은 거리라도 visited로 차단 당해 버림
            // 더 짧아지는 경우 q.add에 들어가게 만들면 덧셈이 앞에 가도 되긴 할듯? 아님 다익스트라로 하던지
            if(position - 1>= 0 && !visited[position - 1]) {
                q.add(position - 1);
                visited[position - 1] = true;
                map[position - 1] = map[position] + 1;
            }// 이전 위치에서의 누적시간 + 1

            // 앞으로 한칸 이동 시 1초 추가
            if(position <= 100000 && !visited[position + 1]) {
                q.add(position+1);
                visited[position + 1] = true;
                map[position+1] = map[position] + 1;
            }// 이전 위치에서의 누적시간 + 1
        }

        return -1;
    }
}