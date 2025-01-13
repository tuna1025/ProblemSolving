import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if (a == b && b == c  && a == 60) System.out.println("Equilateral");
        else if (a + b + c == 180 &&(a == b || b == c || a == c)) System.out.println("Isosceles");
        else if (a + b + c == 180 && a!=b && a!=c && b !=c ) System.out.println("Scalene");
        else System.out.println("Error");
        br.close();
    }
}

