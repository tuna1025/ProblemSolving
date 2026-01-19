import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 조건의 개수
        Map<Character, Set<Character>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int x = Integer.parseInt(st.nextToken());

            // 문자 뒤에 올 규칙 집합
            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < x; j++) {
                set.add(st.nextToken().charAt(0));
            } // 규칙 추가

            map.put(c, set); // c문자 뒤에 set에 포함되는 문자가 와야한다
        }

        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);


            // 규칙이 있는 문자라면 검사
            if(map.containsKey(cur)) {
                if(i == s.length() - 1) continue; // 뒤에 올 문자가 없으면 통과

                char next = s.charAt(i+1); // 다음에 올 문자
                if(!map.get(cur).contains(next)) { // 포함 안되어 있으면
                    System.out.println("no");
                    return;
                }
            }
        }

        System.out.println("yes");
    }
}
