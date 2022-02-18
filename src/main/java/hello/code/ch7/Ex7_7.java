package hello.code.ch7;

public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();

        fe.water();
        car = fe;
        //car.water() 안됨
        FireEngine fe2 = (FireEngine) car;
        fe2.water();

    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("Drive, Brrr~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}
