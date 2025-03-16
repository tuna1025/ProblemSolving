import java.util.*;
import java.io.*;

// 노드를 나타내는 클래스
class Node {
    char value; // 노드의 값 (문자)
    Node left;  // 왼쪽 자식 노드
    Node right; // 오른쪽 자식 노드

    // Node 생성자: 노드의 값을 초기화하고 자식 노드는 null로 설정
    Node(char value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class Main {
    static Node tree[]; // 전체 트리를 저장할 배열

    // 전위 순회: 부모 -> 왼쪽 -> 오른쪽
    public static void preorder(Node root) {
        if (root == null) return; // 노드가 null이면 종료
        System.out.print(root.value); // 현재 노드 값 출력
        preorder(root.left); // 왼쪽 자식 노드 방문
        preorder(root.right); // 오른쪽 자식 노드 방문
    }

    // 중위 순회: 왼쪽 -> 부모 -> 오른쪽
    public static void inorder(Node root) {
        if (root == null) return; // 노드가 null이면 종료
        inorder(root.left); // 왼쪽 자식 노드 방문
        System.out.print(root.value); // 현재 노드 값 출력
        inorder(root.right); // 오른쪽 자식 노드 방문
    }

    // 후위 순회: 왼쪽 -> 오른쪽 -> 부모
    public static void postorder(Node root) {
        if (root == null) return; // 노드가 null이면 종료
        postorder(root.left); // 왼쪽 자식 노드 방문
        postorder(root.right); // 오른쪽 자식 노드 방문
        System.out.print(root.value); // 현재 노드 값 출력
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 노드의 개수 입력 받기
        tree = new Node[N + 1]; // 트리를 노드 개수 크기로 초기화

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char parent = st.nextToken().charAt(0); // 부모 노드 값
            char left = st.nextToken().charAt(0);   // 왼쪽 자식 노드 값
            char right = st.nextToken().charAt(0);  // 오른쪽 자식 노드 값

            // 부모 노드가 처음 생성되는 경우 노드를 생성
            if (tree[parent - 'A'] == null) {
                tree[parent - 'A'] = new Node(parent);
            }
            // 왼쪽 자식 노드가 존재하는 경우
            if (left != '.') {
                tree[left - 'A'] = new Node(left);
                tree[parent - 'A'].left = tree[left - 'A']; // 부모와 연결
            }
            // 오른쪽 자식 노드가 존재하는 경우
            if (right != '.') {
                tree[right - 'A'] = new Node(right);
                tree[parent - 'A'].right = tree[right - 'A']; // 부모와 연결
            }
        }

        // 트리 순회 결과 출력
        preorder(tree[0]); // 전위 순회 결과 출력
        System.out.println();
        inorder(tree[0]);  // 중위 순회 결과 출력
        System.out.println();
        postorder(tree[0]); // 후위 순회 결과 출력
        br.close();
    }
}
