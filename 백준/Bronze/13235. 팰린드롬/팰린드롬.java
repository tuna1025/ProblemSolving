import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        if(s.equals(sb.toString())) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        br.close();
    }
}

