import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine()); // 100,000이하
        int[][] arr = new int[n][2]; // x, y값을 저장할 2차원 배열

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //람다식으로 풀기
        Arrays.sort(arr, (arr1,arr2) -> {
            if (arr1[0] == (arr2[0])) {
                return arr1[1] - arr2[1]; //arr2가 더 작으면 자리 바꾸기
            }
            return arr1[0] - arr2[0]; // arr2가 더 작으면 자리 바꾸기
        });//Arrays.sort의 2번째 인자는 Comparator


        //Comparator로 풀기
//        Arrays.sort(arr, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] a, int[] b) {
//                if (a[0] == b[0]) {
//                    return Integer.compare(a[1], b[1]);
//                }// 첫번째요소(여기선x)가 같으면 2번째로 비교
//                return Integer.compare(a[0],b[0]);//아니면 첫번째로 비교
//            }
//        });// 배열을 제네릭타입을 <int[]>형으로 받음.

        for (int i = 0; i < n; i++) {
            sb.append(arr[i][0] + " " + arr[i][1] + "\n");
        }// 버퍼에 문자열 쌓기
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}