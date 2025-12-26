import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        // 중복 제거를 위한 Set
        Set<String> colors = new HashSet<>();

        colors.add(st1.nextToken()); // 아빠 몸통
        colors.add(st1.nextToken()); // 아빠 꼬리
        colors.add(st2.nextToken()); // 엄마 몸통
        colors.add(st2.nextToken()); // 엄마 꼬리

        // 사전순 정렬
        List<String> list = new ArrayList<>(colors);
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();

        // 모든 조합 출력
        for (String body : list) {
            for (String tail : list) {
                sb.append(body).append(" ").append(tail).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
