import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        // 스택 구현
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.equals("push")) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            else if (s.equals("pop")) {
                if (list.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(list.get(list.size() - 1));
                    list.remove(list.size() - 1);
                }
            }
            else if (s.equals("top")) {
                if (list.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(list.get(list.size() - 1));
                }
            }
            else if (s.equals("empty")) {
                if (list.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
            else if (s.equals("size")) {
                System.out.println(list.size());
            }
        }

        br.close();
    }
}
