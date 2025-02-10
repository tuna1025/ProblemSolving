import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        for(int i = 0; i<10; i++){
            int t = sc.nextInt();
            if (t == 1) {
                a += 90;
            }
            else if (t == 2) {
                a += 180;
            }
            else{
                a += 270;
            }
        }
        a %= 360;
        if (a== 0){
            System.out.println("N");
        }
        else if (a == 90){
            System.out.println("E");
        }
        else if (a == 180){
            System.out.println("S");
        }
        else System.out.println("W");
    }
}