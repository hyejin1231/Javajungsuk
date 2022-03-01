package hello.code.ch12;

import java.util.ArrayList;

class Product{}

class Tv extends Product{}

class Audio extends Product{}

public class Ex12_1 {

    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        ArrayList<Tv> tvList = new ArrayList<>();

        productList.add(new Tv());
        productList.add(new Audio());

        tvList.add(new Tv());
        tvList.add(new Tv());

        printAll(productList);

    }

    public static void printAll(ArrayList<Product> list) {
        for (Product product : list) {
            System.out.println(product);
        }
    }
}
