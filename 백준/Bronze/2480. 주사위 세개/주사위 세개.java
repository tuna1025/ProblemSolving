import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = 0;
        if (a == b && a == c){
            total += 10000 + a*1000;
        }
        else if (a == b || a == c){
                total += 1000 + a*100;
            }
        else if (b == c){
                total += 1000 + c*100;
            }
        
        else{
            int max = Math.max(a, Math.max(b,c));
            total += max*100;
        }
        System.out.println(total);
        sc.close();
    }
}