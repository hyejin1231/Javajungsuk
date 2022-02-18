package hello.code.ch7;

public class Ex7_8 {

    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());
        b.buy(new Computer());


        System.out.println("현재 남은 돈은 = " + b.money);
        System.out.println("현재 포인트는 = " + b.bonusPoint);
    }
}

class Product{
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product {

    Tv1() {
        super(100);
    }

    public String toString() {
        return "TV";
    }
}

class Computer extends Product {

    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= product.price;
        bonusPoint += product.bonusPoint;
        System.out.println(product +"을 구입하셨습니다.");
    }
}


