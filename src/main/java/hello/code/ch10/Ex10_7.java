package hello.code.ch10;

import java.text.DecimalFormat;
import java.util.Calendar;

public class Ex10_7 {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            Number num = df.parse("1,234,567.89"); // parse는 , 포함해서 문자열을 숫자로 변환해준다.
            System.out.print("1,234,567.89" + " - > ");

            double d = num.doubleValue();
            System.out.print(d + " -> ");

            System.out.println(df2.format(num));
        } catch (Exception e) {

        }
    }

}
