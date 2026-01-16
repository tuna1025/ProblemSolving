import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> visited = new HashMap<>();

        int remainder = a % b;
        int idx = 0;

        while (!visited.containsKey(remainder)) {
            visited.put(remainder, idx++);
            remainder = (remainder * a) % b;
        }

        // 순환 길이 = 현재 인덱스 - 처음 등장 인덱스
        System.out.println(idx - visited.get(remainder));
    }
}
