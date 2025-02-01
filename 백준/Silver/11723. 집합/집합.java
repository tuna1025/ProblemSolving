import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int x = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "add":
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) {
                        break;
                    }
                    else set.add(x);
                    break;
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) {
                        set.remove(x);
                    }
                    break;
                case "check":
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) {
                        sb.append("1\n");
                    }
                    else {
                        sb.append("0\n");
                    }
                    break;
                case "toggle":
                    x = Integer.parseInt(st.nextToken());
                    if (set.contains(x)) {
                        set.remove(x);
                        break;
                    }
                    else {
                        set.add(x);
                    }
                    break;
                case "all":
                    set = new HashSet<>(Arrays.asList(
                            1,2,3,4,5,6,7,8,9,10,
                            11,12,13,14,15,16,17,18,19,20
                    ));
                    break;
                case "empty":
                    set = new HashSet<>();
                    break;
            }
        }
        System.out.println(sb.toString());
        br.close();
    }
}