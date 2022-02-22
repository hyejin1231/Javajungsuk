package hello.code.ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {
    public static void main(String[] args) {
        String patterns = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(patterns);
        Scanner sc = new Scanner(System.in);

        Date indate = null;

        System.out.println("날짜를 " + patterns + "의 형태로 입력해주세요.(yyyy/MM/dd)");

        while (sc.hasNextLine()) {
            try {
                indate = df.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("날짜를 " + patterns + "의 형태로 입력해주세요.(yyyy/MM/dd)");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(indate);
        Calendar today = Calendar.getInstance();
        long day  = (cal.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);

        System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");

    }
}
