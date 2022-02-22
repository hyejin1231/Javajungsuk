package hello.code.ch10;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_9 {

    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2022년 2월 22일");
            System.out.println(df2.format(d));
        } catch (Exception e) {

        }
    }

}
