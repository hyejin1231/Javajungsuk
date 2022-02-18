package hello.code.ch6;

// 기본형 참조 변수
public class Ex6_6 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("after change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}

class Data2 {
    int x ;
}
