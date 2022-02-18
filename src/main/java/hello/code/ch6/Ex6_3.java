package hello.code.ch6;

public class Ex6_3 {

    public static void main(String[] args) {
        System.out.println("Card Weight = " + Card.weight);
        System.out.println("Card height = " + Card.height);

        Card card1 = new Card();
        card1.kind = "Heart";
        card1.number = 7;

        Card card2 = new Card();
        card2.kind ="King";
        card2.number= 9;

        System.out.println("card1은 " + card1.kind + "이며, 숫자는 " + card1.number + "이고, 너비는 " + card1.weight + "이고 높이는 " + card1.height);
        System.out.println("card2은 " + card2.kind + "이며, 숫자는 " + card2.number + "이고, 너비는 " + card2.weight + "이고 높이는 " + card2.height);

        card2.kind = "Spade";
        card2.number = 4;

        System.out.println("card1은 " + card1.kind + "이며, 숫자는 " + card1.number + "이고, 너비는 " + card1.weight + "이고 높이는 " + card1.height);
        System.out.println("card2은 " + card2.kind + "이며, 숫자는 " + card2.number + "이고, 너비는 " + card2.weight + "이고 높이는 " + card2.height);

    }


}

class Card {
    String kind;
    int number;

    static int weight = 100;
    static int height = 250;
}
