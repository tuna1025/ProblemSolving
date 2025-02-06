import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] arr = new int[n];
        int maxLength = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }//배열 과일리스트 입력
        
        while (end < n){
            if (map.containsKey(arr[end])){
                map.put(arr[end], map.get(arr[end]) + 1);
            }
            else map.put(arr[end], 1);
            //이미 있으면 1더하고 처음이면 넣어주고

            while (map.size() > 2){
                map.put(arr[start], map.get(arr[start]) - 1);
                if (map.get(arr[start]) == 0){
                    map.remove(arr[start]);
                }
                start++;
            }//과일이 두종류 이상이면 start 인덱스를 앞에서 오른쪽으로 이동하고 키값감소
            //만약 과일의 개수가 0개면 키에서 지움

            int sum = 0;
            for (Integer value : map.values()) {
                sum += value;
            }//모든 값 더해서 현재 길이 구하기
            maxLength = Math.max(maxLength, sum); //최대길이 갱신
            end++;//2종류 이하일때 끝 인덱스 더해줌
        }

        System.out.println(maxLength);
        br.close();
    }
}
