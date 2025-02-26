import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Comparator<Integer> absComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return Integer.compare(o1,o2);
                }
                return Integer.compare(Math.abs(o1), Math.abs(o2));
            }
        }; //비교기, 절대값순으로 정렬하되 절대값이 같으면 작은 수 가 앞에옴

        PriorityQueue<Integer> pq = new PriorityQueue<>(absComparator);

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

           if(x == 0) {
               if(pq.isEmpty()) sb.append(0).append("\n"); // 비어있으면 0출력
               else sb.append(pq.poll()).append("\n"); // 0이 입력 되면 절대값이 제일 작은 수 출력
           }
            else pq.add(x); // x를 우선순위 큐에 추가
        }
        System.out.println(sb);
    }
}