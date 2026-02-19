import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        String[] student = new String[N];
        String[] answer = new String[N];
        
        for (int i = 0; i < N; i++) {
            student[i] = br.readLine();
        }
        
        for (int i = 0; i < N; i++) {
            answer[i] = br.readLine();
        }
        
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            if (student[i].equals(answer[i])) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
