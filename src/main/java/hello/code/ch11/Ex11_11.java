package hello.code.ch11;

import java.util.*;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");

        set.add(new Person("David", 19));
        set.add(new Person("David", 19));
        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}