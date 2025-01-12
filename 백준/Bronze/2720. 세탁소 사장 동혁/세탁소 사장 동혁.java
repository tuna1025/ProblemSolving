import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        int[] arr = new int[4];
        for (int i = 0; i < T; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[0] = x/quarter;
            arr[1] = (x%quarter)/dime;
            arr[2] = ((x%quarter)%dime)/nickel;
            arr[3] = (((x%quarter)%dime)%nickel)/penny;
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }

        br.close();
    }
}

