package hello.code.ch6;

public class Ex6_4 {

    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        long result1 = myMath.add(5L, 3L);
        long result2 = myMath.sub(5L, 3L);
        long result3 = myMath.multi(5L, 3L);
        double result4 = myMath.divide(5L, 3L);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);


    }


}

class MyMath{
    long add(long a, long b) {
        return a + b;
    }

    long sub(long a, long b) {
        return  a -b ;
    }

    long multi(long a, long b) {
        return  a * b;
    }

    double divide(double a, double b) {
        return  a / b;
    }
}

