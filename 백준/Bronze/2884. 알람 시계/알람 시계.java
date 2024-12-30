import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int h,m;
        int time = 45;
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        m = sc.nextInt();

        if (m>=time) {
            System.out.println(h+ " " + (m-time));
        }
        else {
            m += 60;
            if(h == 0){
                h = 23;
                System.out.println(h + " " + (m-time));
            }
            else {System.out.println((h-1) + " " + (m-time));}

        }

        sc.close();
    }
}
