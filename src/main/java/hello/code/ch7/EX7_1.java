package hello.code.ch7;

public class EX7_1 {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        smartTv.channel = 10;
        smartTv.channelUp();
        System.out.println(smartTv.channel);

        smartTv.displayCaption("Hello World!");
        smartTv.caption = true;
        smartTv.displayCaption("Hello World!");
    }
}
class Tv {
    boolean power;
    int channel;

    void power() {
        power = !power;
    }

    void channelUp() {
        channel = ++channel;
    }

    void channelDown() {
        channel = --channel;
    }

}

class SmartTv extends Tv {
    boolean caption;

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
