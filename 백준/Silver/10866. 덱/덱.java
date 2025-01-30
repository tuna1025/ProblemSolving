import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deck = new ArrayDeque<Integer>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push_front":
                    deck.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deck.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if(deck.isEmpty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(deck.pollFirst());
                    break;
                case "pop_back":
                    if(deck.isEmpty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(deck.pollLast());
                    break;
                case "size":
                    System.out.println(deck.size());
                    break;
                case "empty":
                    if(deck.isEmpty()) {
                        System.out.println(1);
                        break;
                    }
                    System.out.println(0);
                    break;
                case "front":
                    if(deck.isEmpty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(deck.peekFirst());
                    break;
                case "back":
                    if(deck.isEmpty()) {
                        System.out.println(-1);
                        break;
                    }
                    System.out.println(deck.peekLast());
                    break;
            }

        }
    }
}