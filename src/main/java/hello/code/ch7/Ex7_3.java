package hello.code.ch7;

public class Ex7_3 {

    public static void main(String[] args) {
        child ch = new child();
        ch.method();
    }
}

class parent {
    int x = 10;
}

class child extends parent{
    int x = 20;

    void method() {
        System.out.println("x = " + x);
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);
    }
}
