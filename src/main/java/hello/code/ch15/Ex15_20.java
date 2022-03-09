package hello.code.ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex15_20 {
    public static void main(String[] args) {
        try {
            String fileName = "Userinfo.ser";
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            ObjectOutputStream out = new ObjectOutputStream(bufferedOutputStream);

            UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
            UserInfo u2 = new UserInfo("JavaWoman", "4321", 26);

            ArrayList<UserInfo> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);
            out.close();
            System.out.println("직렬화가 끝났습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
