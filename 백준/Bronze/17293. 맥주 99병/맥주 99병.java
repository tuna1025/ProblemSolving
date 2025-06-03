import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int original = n;

        for (int i = n; i >= 0; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (i - 1) + (i - 1 == 1 ? " bottle" : " bottles") + " of beer on the wall.");
            } else if (i == 1) {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
            } else {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, " + original + (original == 1 ? " bottle" : " bottles") + " of beer on the wall.");
            }
            if (i != 0) System.out.println(); // 줄 간격 맞춤
        }
    }
}
