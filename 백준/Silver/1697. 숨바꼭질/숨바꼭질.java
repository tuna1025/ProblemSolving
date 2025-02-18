import java.io.*;
import java.util.*;

class Main {
    static int[] map = new int[100001];
    static boolean[] visited = new boolean[100001];
    static int N,K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());//시작위치
        K = Integer.parseInt(st.nextToken());//찾는위치
        System.out.println(bfs(N));
    }

    public static int bfs(int i) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        int index = i;
        visited[i] = true;

        while (!q.isEmpty()) {
            index = q.poll();
            if (index == K){
                return map[index];
            }
            if (index - 1 >= 0 && !visited[index-1]) {
                visited[index-1] = true;
                map[index-1] = map[index]+1;
                q.add(index - 1);
            }
            if (index + 1 <= 100000 && !visited[index+1]) {
                visited[index+1] = true;
                map[index+1] = map[index]+1;
                q.add(index + 1);
            }
            if (index*2 <= 100000 && !visited[index*2]) {
                visited[index*2] = true;
                map[index*2] = map[index]+1;
                q.add(index * 2);
            }
        }//방문조건 검사시 index가 배열의 크기를 초과하면 에럭남 때문에 index의 크기 먼저 비교

        return -1;
    }
}