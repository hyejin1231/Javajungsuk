package hello.code.ch6;

public class Ex6_7 {

    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);
        System.out.println("d = " + d.x);
        System.out.println("d2 = " + d2.x);


    }

    static Data3 copy(Data3 data3) {
        Data3 tmp = new Data3();
        tmp.x = data3.x;

        return tmp;

    }
}

class Data3 {
    int x;
}
