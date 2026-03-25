import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        String[] words = sc.nextLine().split(" ");

        for (String w : words) {
            System.out.print(w + "DORO ");
        }
    }
}