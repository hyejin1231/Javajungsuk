package hello.code.ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex15_4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        int data = 0;

        while ((data = fileInputStream.read()) != -1) {
            char c = (char) data;
            System.out.println(c);
        }
    }
}
