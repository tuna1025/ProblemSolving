import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int h = input.nextInt();
        int m = input.nextInt();
        int time = input.nextInt();

        int  min = (h*60)+m;
        min = min +time;
        h = min/60;
        m = min%60;

        if(h>=24) {
            System.out.println(h%24 + " " + m);
        }else {
            System.out.println(h +" "+ m);
        }



    }
}