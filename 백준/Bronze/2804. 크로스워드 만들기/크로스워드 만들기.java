import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int col = -1;
        int row = -1;

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);
            int idx = B.indexOf(ch);
            if (idx != -1) {
                col = i;
                row = idx;
                break;
            }
        }

        for (int i = 0; i < B.length(); i++) {
            if (i == row) {
                System.out.println(A);
            } else {
                for (int j = 0; j < A.length(); j++) {
                    if (j == col) {
                        System.out.print(B.charAt(i));
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
        }
    }
}