package hello.code.ch7;

public class Ex7_13 {

    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        // 외부 클래스의 private도 접근 가능하다.
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner {
        //        int siv = outerIv;
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;
        class LocalInner {
            int iiv = outerIv;
            int iiv2 = outerCv;

            int iiv3 =lv; // jdk 1.8부터는 가능
            int iiv4 = LV;
        }
    }
}
