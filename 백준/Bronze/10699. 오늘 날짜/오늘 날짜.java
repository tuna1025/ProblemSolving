import java.io.*; // 입출력 관련 클래스를 포함
import java.text.DateFormat; // 날짜 형식 관련 클래스 포함
import java.text.SimpleDateFormat; // 간단한 날짜 형식 관련 클래스 포함
import java.util.*; // 유틸리티 클래스 포함 (예: TimeZone, Date)


public class Main {
    public static void main(String[] args) throws IOException {
        // 현재 시간을 가져오는 Date 객체 생성
        Date date = new Date();

        // 날짜 형식 설정: "yyyy-MM-dd"
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        // 날짜 형식에 시간대 설정: 아시아/서울 시간대
        format.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));

        // 현재 날짜와 시간 출력
        System.out.println(format.format(date));
    }
}