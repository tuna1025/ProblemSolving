import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        //메모리 제한을 어떻게 할까
        int[] arr = new int[10001]; //주어진 수의 범위 1 ~ 10000, 인덱스와 수를 매칭시키기 위해 1추가로 잡음

        for (int i = 0; i < n; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }//입력 인덱스의 값 증가

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != 0) {
                bw.write(i + "\n");
                arr[i]--;
            }
        }
        // O(n) + 알파?, 1차원 배열 써서 O(n)이라고 해도 될듯
        bw.flush();
        bw.close();
        br.close();
    }
}