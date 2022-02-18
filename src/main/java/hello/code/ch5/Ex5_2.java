package hello.code.ch5;

import java.util.Arrays;

public class Ex5_2 {

    public static void main(String[] args) {
        int sum = 0 ;
        float average = 0f;

        int[] score = {100, 40, 50, 60, 90};

        int max = score[0];
        int min = score[0];

        for (int i : score) {
            sum += i;
        }

        average = sum / (float) score.length;

        for (int i : score) {
            if (max < i) {
                max = i;
            } else if (min > i) {
                min = i;
            }
        }

        System.out.println("총합 = " + sum);
        System.out.println("평균 = " + average);

        System.out.println("최소값 = " + min);
        System.out.println("최대값 = " + max);
    }
}
