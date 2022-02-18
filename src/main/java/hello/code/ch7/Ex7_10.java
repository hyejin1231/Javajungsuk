package hello.code.ch7;

public class Ex7_10 {
    public static void main(String[] args) {
        Unit[] group = {new Marine(), new Tank(), new Dropship()};

        for (Unit unit : group) {
            unit.move(100, 200);
        }
    }
}

abstract class Unit {
    int x,y;

    abstract void move(int x, int y);

    void stop() {
        // 현재 위치에서 정지
    }
}

class Marine extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Marine [ x = " + x + ", y = " + y);
    }

    void stimPack() {
        // 스팀팩을 사용한다.
    }
}

class Tank extends Unit {

    @Override
    void move(int x, int y) {
        System.out.println("Tank [ x =  " + x + ", y = " + y);
    }

    void changeMode() {
        // 모드 변경
    }
}


class Dropship extends Unit{

    @Override
    void move(int x, int y) {
        System.out.println("Dropship [ x = " + x + " , y = " + y);
    }

    void load() {

    }

    void unload() {

    }
}
