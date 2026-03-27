import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int k = sc.nextInt();
            list.add(list.size() - k, i);
        }

        for (int x : list) {
            System.out.print(x + " ");
        }
    }
}