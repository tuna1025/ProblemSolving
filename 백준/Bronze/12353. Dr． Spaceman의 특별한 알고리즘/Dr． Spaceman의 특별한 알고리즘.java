import java.util.*;

public class Main {

    static int toInch(String s) {
        int idx1 = s.indexOf('\'');
        int idx2 = s.indexOf('"');

        int feet = Integer.parseInt(s.substring(0, idx1));
        int inch = Integer.parseInt(s.substring(idx1 + 1, idx2));

        return feet * 12 + inch;
    }

    static String toHeight(int inch) {
        int feet = inch / 12;
        int in = inch % 12;
        return feet + "'" + in + "\"";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {

            char gender = sc.next().charAt(0);
            String mother = sc.next();
            String father = sc.next();

            int m = toInch(mother);
            int f = toInch(father);

            double mid;

            if (gender == 'B')
                mid = (m + f + 5) / 2.0;
            else
                mid = (m + f - 5) / 2.0;

            int min = (int) Math.ceil(mid - 4);
            int max = (int) Math.floor(mid + 4);

            System.out.println(
                "Case #" + t + ": " + toHeight(min) + " to " + toHeight(max)
            );
        }
    }
}