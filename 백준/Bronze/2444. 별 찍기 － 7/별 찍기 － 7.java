import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int n = size - 1;

        for (int i = -n; i <= n; i++) {
            boolean isStarPrinted = false;
            for (int j = -n; j <= n; j++) {
                if (Math.abs(i) + Math.abs(j) <= n) {
                    System.out.print("*");
                    isStarPrinted = true;
                } else if (isStarPrinted) {
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
