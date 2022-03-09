package hello.code.ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex15_6 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("123.txt");

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 5);

            for (int i = '1'; i <= 9; i++) {
                bufferedOutputStream.write(i);
            }

            fileOutputStream.close();
        } catch (IOException e) {

        }
    }
}
