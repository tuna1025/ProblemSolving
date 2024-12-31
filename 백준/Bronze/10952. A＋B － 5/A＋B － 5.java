import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum ;
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = a + b;
            if (sum == 0){
                break;
            }
            System.out.println(sum);
        }
    }
}