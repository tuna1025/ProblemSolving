import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a1 = sc.nextInt();
       int a0 = sc.nextInt();
       int c = sc.nextInt();
       int n = sc.nextInt();
       if(a1*n + a0 <= c*n && a1<=c){
           System.out.println(1);
       }// g(n)의 기울기가 f(n)보다 크고 초기에주어진 n 보다 커야한다.
       else{
           System.out.println(0);
       }
       sc.close();
    }
}