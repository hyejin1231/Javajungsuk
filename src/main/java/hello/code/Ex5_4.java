package hello.code;

import java.util.Arrays;

public class Ex5_4 {

    // 로또 번호 생성하기
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        int tmp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);
            tmp = ball[i];
            ball[i] = ball[j];
            ball[j] = tmp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("ball [%d] = %d%n", i, ball[i]);
        }

    }
}
