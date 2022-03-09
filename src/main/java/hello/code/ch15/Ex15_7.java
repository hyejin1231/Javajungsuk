package hello.code.ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class Ex15_7 {
    public static void main(String[] args) {
        byte[] arr1 = {0, 1, 2};
        byte[] arr2 = {3, 4, 5};
        byte[] arr3 = {6, 7, 8};
        byte[] outSrc = null;

        Vector v = new Vector();
        v.add(new ByteArrayInputStream(arr1));
        v.add(new ByteArrayInputStream(arr2));
        v.add(new ByteArrayInputStream(arr3));

        SequenceInputStream inputStream = new SequenceInputStream(v.elements());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        int data = 0;

        try {
            while ((data = inputStream.read()) != -1) {
                outputStream.write(data);
            }
        } catch (IOException e) {

        }

        outSrc = outputStream.toByteArray();

        System.out.println("Input Source1 :" + Arrays.toString(arr1));
        System.out.println("Input Source2 :" + Arrays.toString(arr2));
        System.out.println("Input Source3 :" + Arrays.toString(arr3));
        System.out.println("Output Source :" + Arrays.toString(outSrc));
    }
}
