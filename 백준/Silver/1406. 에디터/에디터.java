import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<String> leftstack = new Stack<>();
        Stack<String> rightstack = new Stack<>();
        //스택 2개의 탑을 기준으로 커서의 왼쪽이 왼쪽스택 오른쪽이 오른쪽스택으로 두기
        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < str.length(); i++) {
            leftstack.push(str.charAt(i) + "");
        }//처음엔 오른쪽에 아무것도 없으니 왼쪽스택에 몰아주기

        for (int i = 0; i < n; i++){
            String line = br.readLine();
            switch (line.charAt(0)) {
                case 'L':
                    if (!leftstack.empty()) {
                        rightstack.push(leftstack.pop());
                    }
                    break;//왼쪽으로 이동하기때문에 오른쪽스택으로 옳기기
                    case 'D':
                        if (!rightstack.empty()) {
                            leftstack.push(rightstack.pop());
                        }
                        break;
                        case 'B':
                            if (!leftstack.empty()) {
                                leftstack.pop();
                            }//커서왼쪽지우기
                            break;
                case 'P':
                    leftstack.push(line.charAt(2) + "");
                    break;
                    //커서 왼쪽에 문자 추기
            }
        }
        while (!leftstack.empty()) {
            rightstack.push(leftstack.pop());
        }//오른쪽으로 스택밀어줘서 맨 앞으로 커서옮기기
        while (!rightstack.empty()) {
            bw.write(rightstack.pop());
        }//앞부터 출력
        bw.flush();
        bw.close();
        br.close();
    }
}