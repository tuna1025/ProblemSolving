import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ans = a - a * 10 / 110;
        System.out.println(ans);
    }


}