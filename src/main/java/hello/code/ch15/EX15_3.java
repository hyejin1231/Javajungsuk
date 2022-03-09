package hello.code.ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class EX15_3 {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        ByteArrayInputStream inputStream = null;
        ByteArrayOutputStream outputStream = null;

        inputStream = new ByteArrayInputStream(inSrc);
        outputStream = new ByteArrayOutputStream();

        System.out.println("Input Source : " + Arrays.toString(inSrc));

        try {
            while (inputStream.available() > 0) {
                inputStream.read(temp);
                outputStream.write(temp);

                outSrc = outputStream.toByteArray();
                printArrays(temp, outSrc);
            }
        } catch (IOException e) {

        }
    }

    private static void printArrays(byte[] temp, byte[] outSrc) {
        System.out.println("temp        :" + Arrays.toString(temp));
        System.out.println("Output Source : " + Arrays.toString(outSrc));
    }
}
