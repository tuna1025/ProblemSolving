import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        if(a.equals("M")) {
            System.out.println("MatKor");
        }else if(a.equals("W")) {
            System.out.println("WiCys");
        }else if(a.equals("C")) {
            System.out.println("CyKor");
        }else if(a.equals("A")) {
            System.out.println("AlKor");
        }else if(a.equals("$")) {
            System.out.println("$clear");
        }
    }
}
