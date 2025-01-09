import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double[] b = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        double currentGrade = 0.0;
        double numScore = 0;
        for(int i = 0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken(); //과목이름
            double grade = Double.parseDouble(st.nextToken());
            String strScore = st.nextToken();//등급 문자열

            if(!strScore.equals("P")){
                for (int j = 0; j < arr.length-1; j++){
                    if(arr[j].equals(strScore)){
                        currentGrade += grade;
                        numScore += b[j]*grade;
                    }
                }
            }
        }
        System.out.println(numScore/currentGrade);
    }
}

