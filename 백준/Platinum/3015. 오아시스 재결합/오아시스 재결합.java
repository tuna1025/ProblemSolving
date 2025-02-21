import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력을 받기 위한 BufferedReader 객체 생성
        Stack<Pair> stack = new Stack<>(); // 사람의 키를 저장할 스택 생성
        int N = Integer.parseInt(br.readLine()); // 줄에서 기다리고 있는 사람의 수 입력 받기
        long cnt = 0; // 서로 볼 수 있는 쌍의 수를 저장할 변수 n이 최대 500,000이므로 long으로 해줌

        for (int i = 0; i < N; i++) { // N명의 사람의 키를 입력받기 위한 반복문
            int num = Integer.parseInt(br.readLine()); // 각 사람의 키 입력 받기
            Pair pair = new Pair(num, 1); // 현재 사람의 키와 초기 개수를 포함한 Pair 객체 생성

            while (!stack.isEmpty() && stack.peek().height <= num) { // 스택이 비어있지 않고, 스택의 최상위 요소가 현재 사람의 키보다 작거나 같은 동안 반복
                Pair p = stack.pop(); // 스택의 최상위 요소를 꺼내옴
                cnt += p.cnt; // 꺼내온 요소의 cnt 값을 서로 볼 수 있는 쌍의 수에 더함
                if (p.height == num) { // 만약 꺼내온 요소의 키가 현재 사람의 키와 같다면
                    pair.cnt += p.cnt; // 현재 Pair 객체의 cnt 값을 증가시킴
                }//키가 같은 경우 묶어서 새줌
            }//스택을 내림차순으로 유지시켜야됨

            if (!stack.isEmpty()) { // 스택이 비어있지 않다면
                cnt++; // 서로 볼 수 있는 쌍의 수를 증가시킴
            }// 추가해주는 이유는 스택에 추가될 사람보다 키큰사람이 있다는 뜻이므로 그사람도 추가된 사람 볼 수 있어서 볼수 있는 쌍 추가

            stack.push(pair); // 현재 Pair 객체를 스택에 추가
        }
        System.out.println(cnt); // 최종적으로 계산된 서로 볼 수 있는 쌍의 수를 출력
    }

    // 사람의 키와 키의 개수를 저장하는 Pair 클래스 정의
    public static class Pair {
        int height, cnt;

        Pair(int height, int cnt) {
            this.height = height;
            this.cnt = cnt;
        }
    }
}
