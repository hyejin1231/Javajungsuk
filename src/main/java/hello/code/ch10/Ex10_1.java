package hello.code.ch10;

import java.util.Calendar;

public class Ex10_1 {

    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println(today.get(Calendar.YEAR));
        System.out.println(today.get(Calendar.WEEK_OF_YEAR));
        System.out.println(today.get(Calendar.WEEK_OF_MONTH));

        System.out.println();
        System.out.println(Calendar.DATE);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK);

        System.out.println();
        System.out.println(Calendar.HOUR);
        System.out.println(Calendar.HOUR_OF_DAY);
        System.out.println(Calendar.MINUTE);
        System.out.println(Calendar.SECOND);
        System.out.println(Calendar.MILLISECOND);

    }
}
