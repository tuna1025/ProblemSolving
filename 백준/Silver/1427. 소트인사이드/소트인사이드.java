import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[11]; //주어진 수의 범위 1 ~ 10000, 인덱스와 수를 매칭시키기 위해 1추가로 잡음
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - '0']++;
        }//입력 인덱스의 값 증가

        for (int i = arr.length-1; i >= 0; i--) {
            while (arr[i] != 0) {
               sb.append(i);//문자열 누적
                arr[i]--;
            }
        }
        bw.write(sb.toString()); //한번에 출력, 메모리 관리에 좋은듯?
        // O(n) + 알파?, 1차원 배열 써서 O(n)이라고 해도 될듯
        bw.flush();
        bw.close();
        br.close();
    }
}