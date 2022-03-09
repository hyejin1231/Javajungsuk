package hello.code.ch15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex15_11 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("Ex15_10.java");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            for (int i = 1; (line = bufferedReader.readLine()) != null; i++) {
                if (line.indexOf(";") != -1) {
                    System.out.println(i + " : " + line);
                }
            }

            bufferedReader.close();
        } catch (IOException e) {

        }
    }
}
