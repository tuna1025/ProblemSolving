import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String s1 = "◝(⑅•ᴗ•⑅)◜..°♡ 뀌요미!!";
        final String s2 = "흥칫뿡!! <(￣ ﹌ ￣)>";
        String s = scanner.nextLine();
        if (s.length() <= 2) {
            System.out.println(s1);
        }
        else {
            int n = 0;
            int temp = s.charAt(1) - s.charAt(0);
            for (int i = 1; i < s.length(); i++) {
                n = s.charAt(i) - s.charAt(i-1);
                if(temp != n){
                    System.out.println(s2);
                    return;
                }
            }
            System.out.println(s1);
        }

    }
}
