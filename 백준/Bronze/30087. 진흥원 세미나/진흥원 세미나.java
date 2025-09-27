import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, String> room = new HashMap<>();
        room.put("Algorithm", "204");
        room.put("DataAnalysis", "207");
        room.put("ArtificialIntelligence", "302");
        room.put("CyberSecurity", "B101");
        room.put("Network", "303");
        room.put("Startup", "501");
        room.put("TestStrategy", "105");
        for (int i = 0; i < n; i++) {
            System.out.println(room.get(br.readLine()));
        }
    }
}
