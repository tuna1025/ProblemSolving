import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set <Set<Integer>> faces = new HashSet();
        faces.add(Set.of(0, 1, 2, 3));
        faces.add(Set.of(4, 5, 6, 7));
        faces.add(Set.of(0, 1, 4, 5));
        faces.add(Set.of(2, 3, 6, 7));
        faces.add(Set.of(0, 2, 4, 6));
        faces.add(Set.of(1, 3, 5, 7));

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            Set<Integer> face = Set.of(a, b, c, d);
            if (faces.contains(face)) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }

    }
}

