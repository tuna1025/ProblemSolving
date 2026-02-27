import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  번역
        Map<String, String> map = new HashMap<>();
        map.put("CU", "see you");
        map.put(":-)", "I’m happy");
        map.put(":-(", "I’m unhappy");
        map.put(";-)", "wink");
        map.put(":-P", "stick out my tongue");
        map.put("(~.~)", "sleepy");
        map.put("TA", "totally awesome");
        map.put("CCC", "Canadian Computing Competition");
        map.put("CUZ", "because");
        map.put("TY", "thank-you");
        map.put("YW", "you’re welcome");
        map.put("TTYL", "talk to you later");

        while (true) {
            String input = sc.nextLine();

            if (map.containsKey(input)) {
                System.out.println(map.get(input));
            } else {
                System.out.println(input);
            }

            // TTYL 입력 시 종료 (번역 출력 후 종료)
            if (input.equals("TTYL")) {
                break;
            }
        }

        sc.close();
    }
}