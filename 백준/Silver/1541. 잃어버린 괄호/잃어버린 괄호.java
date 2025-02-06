import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sub = new StringTokenizer(br.readLine(),"-"); //-를 기준으로 토큰화
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(sub.hasMoreTokens()){
            StringTokenizer add = new StringTokenizer(sub.nextToken(),"+");//토큰화한 덩어리를 +로 다시 토큰화
            int sum = 0;
            while(add.hasMoreTokens()){
                sum += Integer.parseInt(add.nextToken()); //두번쪼갠토큰 다시 다 더해줌
            }
            list.add(sum);
        }
        int first = list.get(0); //뺄셈 당할 첫번째 수 
        for (int i = 1; i < list.size(); i++) {
            first -= list.get(i);
        }// 첫번째수에 전부 빼줌
        System.out.println(first);
        br.close();
    }
}