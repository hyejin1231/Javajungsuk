package hello.code.ch9;

public class Ex9_5 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", 20);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

class Card2 {
    String kind;
    int number;

    Card2() {
        this("SPACE", 1);
    }

    public Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card2{" +
                "kind='" + kind + '\'' +
                ", number=" + number +
                '}';
    }
}
