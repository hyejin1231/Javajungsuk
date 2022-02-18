package hello.code.ch7;

public class Ex7_12 {

    class InstanceInner {
        int iv = 100;
        // static int cv =  100; 안됨
        final static int CONST = 100;
    }

    static class StaticInner {
        int iv = 100;
        static int cv = 100; // static 클래스 안에서 static 멤버 정의 가능
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
            // static int cv = 200; // 안됨
            final static int CONST = 200;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
