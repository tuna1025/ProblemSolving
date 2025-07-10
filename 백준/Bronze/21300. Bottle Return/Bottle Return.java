import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] bottles = new int[6];
        for (int i = 0; i < bottles.length; i++) {
            bottles[i] = scanner.nextInt();
        }

        int depositPerBottle = 5;

        int total = 0;
        for (int count : bottles) {
            total += count * depositPerBottle;
        }


        System.out.println(total);
    }
}
