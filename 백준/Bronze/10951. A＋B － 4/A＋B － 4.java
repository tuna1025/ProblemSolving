import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum ;
        while (sc.hasNext()) {//입력이 있을경우 true 없으면 false
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = a + b;
            System.out.println(sum);
        }
    }
}