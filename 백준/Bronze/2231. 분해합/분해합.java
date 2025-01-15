import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = i;
            sum = 0;
            while(num != 0){
                sum += num%10;
                num /= 10;
            }//num을 10단위로 나눈 나머지를 sum에 더함
            sum += i;
            if (sum == n){
                System.out.println(i);
                break;
            }
        }
        if(sum != n){
            System.out.println(0);
        }
    }
}