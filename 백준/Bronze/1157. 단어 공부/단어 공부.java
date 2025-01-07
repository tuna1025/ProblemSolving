import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        char[] alphabet = new char[26];
        int[] alphaIndex = new int[26];
        int max = Integer.MIN_VALUE;
        int same = 0; // same 변수를 0으로 초기화
        int index = 0;

        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (s.charAt(i) == alphabet[j]) {
                    alphaIndex[j] += 1;
                }
            }
        }

        for (int i = 0; i < alphaIndex.length; i++) {
            if (alphaIndex[i] > max) {
                max = alphaIndex[i];
                index = i;
                same = 1; // 새로운 최대값을 찾았을 때 same을 1로 설정
            } else if (alphaIndex[i] == max) {
                same++;
            }
        }

        if (s.length() == 1) {
            System.out.println(s);
        } else if (same > 1) { // 동일한 빈도의 알파벳이 2개 이상일 때
            System.out.println("?");
        } else {
            System.out.println(alphabet[index]);
        }

        br.close();
    }
}
