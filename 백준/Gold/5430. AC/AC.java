import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        while (T-- > 0) { // 각 테스트 케이스에 대해 반복
            Queue<Character> command = new ArrayDeque<>();
            String s = br.readLine(); // 명령어 읽기
            for (int i = 0; i < s.length(); i++) {
                command.add(s.charAt(i)); // 명령어를 큐에 추가
            }

            int N = Integer.parseInt(br.readLine()); // 배열에 들어있는 수 n
            StringTokenizer st = new StringTokenizer(br.readLine(), "[]," ); // [,], 기준으로 토큰화
            while (st.hasMoreTokens()) {
                dq.addLast(Integer.parseInt(st.nextToken())); // 덱에 숫자 추가
            }

            boolean flag = true; // 앞뒤 회전용
            boolean errorCheck = true; // 에러 체크용
            while (!command.isEmpty()) { // 명령어 큐가 비어있지 않을 때까지 반복
                char nextCommand = command.poll(); // 명령어 가져오기
                if (nextCommand == 'R') { // R 명령어인 경우
                    if(flag) flag = false; // 회전 방향 변경
                    else flag = true;
                } else { // D 명령어인 경우
                    if (dq.isEmpty()) { // 덱이 비어있는 경우
                        sb.append("error").append('\n'); // 에러 출력
                        errorCheck = false;
                        break; // 반복문 종료
                    }

                    if (flag) {
                        dq.removeFirst(); // 앞부분 제거
                    } else {
                        dq.removeLast(); // 뒷부분 제거
                    }
                }
            }

            if (errorCheck) { // 에러가 발생하지 않은 경우
                if(flag){
                    sb.append("[");
                    while(!dq.isEmpty()){
                        sb.append(dq.removeFirst()).append(",");
                    }
                    if(sb.charAt(sb.length()-1) == ',') sb.deleteCharAt(sb.length()-1); // 마지막 ,제거
                    sb.append("]").append("\n");

                }
                else {
                    sb.append("[");
                    while(!dq.isEmpty()){
                        sb.append(dq.removeLast()).append(",");
                    }
                    if(sb.charAt(sb.length()-1) == ',') sb.deleteCharAt(sb.length()-1); // 마지막 ,제거
                    sb.append("]").append("\n");
                }
            }
        } // 배열에 남은 숫자 출력

        System.out.println(sb); // 결과 출력
        br.close();
    }
}
