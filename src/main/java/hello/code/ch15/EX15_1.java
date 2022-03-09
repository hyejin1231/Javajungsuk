package hello.code.ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class EX15_1 {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;

        ByteArrayInputStream inputStream = null;
        ByteArrayOutputStream outputStream = null;

        inputStream = new ByteArrayInputStream(inSrc);
        outputStream = new ByteArrayOutputStream();

        int data = 0;
        while ((data = inputStream.read()) != -1) {
            outputStream.write(data);
        }

        outSrc = outputStream.toByteArray(); // 스트림 내용을 byte 배열로 반환

        System.out.println("Input Source :" + Arrays.toString(inSrc));
        System.out.println("Output Source : " + Arrays.toString(outSrc));
    }
}
