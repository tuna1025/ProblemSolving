import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] ch = br.readLine().toCharArray();
        int count = ch.length;
        int length = 0;

        for (int i = 0; i < ch.length; i++) {
            if (i < ch.length - 1 && ch[i] == 'c' && ch[i + 1] == '=') {
                count--;
                length += 2;
                i++; // 'c='인 경우 i를 증가
            } else if (i < ch.length - 1 && ch[i] == 'c' && ch[i + 1] == '-') {
                count--;
                length += 2;
                i++; // 'c-'인 경우 i를 증가
            } else if (i < ch.length - 1 && ch[i] == 'd' && ch[i + 1] == '-') {
                count--;
                length += 2;
                i++; // 'd-'인 경우 i를 증가
            } else if (i < ch.length - 1 && ch[i] == 'l' && ch[i + 1] == 'j') {
                count--;
                length += 2;
                i++; // 'lj'인 경우 i를 증가
            } else if (i < ch.length - 1 && ch[i] == 'n' && ch[i + 1] == 'j') {
                count--;
                length += 2;
                i++; // 'nj'인 경우 i를 증가
            } else if (i < ch.length - 1 && ch[i] == 's' && ch[i + 1] == '=') {
                count--;
                length += 2;
                i++; // 's='인 경우 i를 증가
            } else if (i < ch.length - 1 && ch[i] == 'z' && ch[i + 1] == '=') {
                count--;
                length += 2;
                i++; // 'z='인 경우 i를 증가
            } else if (i < ch.length - 2 && ch[i] == 'd' && ch[i + 1] == 'z' && ch[i + 2] == '=') {
                count -= 2;
                length += 3;
                i += 2; // 'dz='인 경우 i를 2만큼 증가
            } else {
                length++;
            }
            if (length >= ch.length) break;
        }
        System.out.println(count);
        br.close();
    }
}
