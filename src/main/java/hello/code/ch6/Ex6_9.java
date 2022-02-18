package hello.code.ch6;

public class Ex6_9 {
    public static void main(String[] args) {
        // static 메서드
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.sub(200L, 100L));
        System.out.println(MyMath2.multi(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));

        MyMath2 myMath2 = new MyMath2();
        myMath2.a = 200L;
        myMath2.b = 100L;

        System.out.println(myMath2.add());
        System.out.println(myMath2.sub());
        System.out.println(myMath2.multi());
        System.out.println(myMath2.divide());

    }
}

class MyMath2 {
    long a,  b;

    // 인스턴스 메서드
    long add() {
        return a + b;}

    long sub() {
        return a-b;
    }

    long multi() {
        return a* b;
    }

    double divide() {
        return a/ b;
    }

    // static 메서드
    static  long add(long a, long b){
        return a + b;}

    static long sub(long a, long b) {
        return a - b;
    }

    static long multi(long a, long b) {
        return a * b;
    }

    static double divide(long a, long b) {
        return a /(double) b;
    }

}
