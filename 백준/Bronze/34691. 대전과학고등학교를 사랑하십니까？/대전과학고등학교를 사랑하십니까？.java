import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            switch (s) {
                case "animal":
                    System.out.println("Panthera tigris");
                    break;
                case "flower":
                    System.out.println("Forsythia koreana");
                    break;
                case "tree":
                    System.out.println("Pinus densiflora");
                    break;
                    default:
                        return;
            }
        }
    }
}