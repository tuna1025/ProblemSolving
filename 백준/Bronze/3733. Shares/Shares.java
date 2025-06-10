import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int s = 0;
        while(scanner.hasNext()){
            n = scanner.nextInt();
            s = scanner.nextInt();
            System.out.println(s/(n+1));
        }

    }
}