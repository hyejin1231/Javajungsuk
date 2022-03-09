package hello.code.ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

 class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream(args[0]);
            FileOutputStream outputStream = new FileOutputStream(args[1]);

            int data = 0;

            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }

            inputStream.close();
            outputStream.close();
        } catch (IOException e) {

        }
    }
}
