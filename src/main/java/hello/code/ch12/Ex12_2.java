package hello.code.ch12;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student next = iterator.next();
            System.out.println(next.name);
        }
    }
}

class Student{
    String name = "";
    int ban;
    int no;

    public Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}

