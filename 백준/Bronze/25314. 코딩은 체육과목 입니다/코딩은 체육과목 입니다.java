import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int count = n/4; count > 0; count--) {
            System.out.print("long ");
        }
        System.out.println("int");
        sc.close();
    }
}