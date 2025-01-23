import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                    case "pop":
                        if (queue.isEmpty()) {
                            bw.write("-1\n");
                        }
                        else bw.write(queue.poll() + "\n");
                        break;
                        case "size":
                            bw.write(queue.size() + "\n");
                            break;
                case "empty":
                    if (queue.isEmpty()) {
                        bw.write("1\n");
                    }
                    else bw.write("0\n");
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                    }
                    else bw.write(queue.peek() + "\n");
                    break;
                    case "back":
                        if (queue.isEmpty()) {
                            bw.write("-1\n");
                        }
                        else bw.write(((LinkedList<Integer>) queue).peekLast() + "\n");
                        break;//연결리스트의 구현된 큐이기때문에 맨 뒤의 요소 반환가능
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}