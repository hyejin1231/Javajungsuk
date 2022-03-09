package hello.code.ch15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex15_21 {
    public static void main(String[] args) {
        try {
            String fileName = "Userinfo.ser";
            FileInputStream fileInputStream = new FileInputStream(fileName);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            ObjectInputStream in = new ObjectInputStream(bufferedInputStream);

            UserInfo u1 = (UserInfo) in.readObject();
            UserInfo u2 = (UserInfo) in.readObject();
            ArrayList<UserInfo> list = (ArrayList<UserInfo>) in.readObject();

            System.out.println(u1);
            System.out.println(u2);
            System.out.println(list);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
