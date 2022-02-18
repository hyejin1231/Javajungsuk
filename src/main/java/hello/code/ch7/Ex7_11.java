package hello.code.ch7;

public class Ex7_11 {
    public static void main(String[] args) {
        Child3 child3 = new Child3();
        child3.method1();
        child3.method2();

        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Parent3 {
    public void method2() {
        System.out.println("Parent3.method2");
    }
}

interface MyInterface {
    default void method1() {
        System.out.println("MyInterface.method1");
    }

    default void method2() {
        System.out.println("MyInterface.method2");
    }

    static void staticMethod() {
        System.out.println("MyInterface.staticMethod");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("MyInterface2.method1");
    }

    static void staticMethod() {
        System.out.println("MyInterface2.staticMethod");
    }
}

class Child3 extends Parent3 implements MyInterface, MyInterface2 {

    @Override
    public void method1() {
        System.out.println("Child3.method1");
    }
}
