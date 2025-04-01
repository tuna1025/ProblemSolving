import java.io.*;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Date date =new Date();
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        SimpleDateFormat month = new SimpleDateFormat("MM");
        SimpleDateFormat day = new SimpleDateFormat("dd");
        System.out.println(year.format(date));
        System.out.println(month.format(date));
        System.out.println(day.format(date));
    }
}