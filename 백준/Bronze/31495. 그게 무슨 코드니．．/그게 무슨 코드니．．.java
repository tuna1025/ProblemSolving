import java.io.*;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.length() < 3) System.out.println("CE");
        else if(s.charAt(0) == '\"' && s.charAt(s.length()-1) == '\"') System.out.println(s.substring(1, s.length()-1));
        else System.out.println("CE");
    }
}
