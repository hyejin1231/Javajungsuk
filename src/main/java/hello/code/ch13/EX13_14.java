package hello.code.ch13;

import java.util.ArrayList;

class Customer implements Runnable {

    private Table table;
    private String food;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }

            String name = Thread.currentThread().getName();

            if (eatFood()) {
                System.out.println(name + "ate a " + food);
            }else {
                System.out.println(name + "ate a " + food);
            }
        }

    }

    boolean eatFood() {
        return table.remove(food);
    }
}

class Table {
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        if (dishes.size() >= MAX_FOOD) {
            return;
        }

        dishes.add(dish);
        System.out.println("Dishes : " + dish.toString());
    }

    public boolean remove(String dishName) {
        synchronized (this) {
            while (dishes.size() == 0) {
                String name = Thread.currentThread().getName();
                System.out.println(name + "is wating");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }

            for (int i = 0; i < dishes.size(); i++) {
                if (dishName.equals(dishes.get(i))) {
                    dishes.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public int dishNum() {
        return dishNames.length;
    }
}

public class EX13_14 {
    public static void main(String[] args) {
        Table table = new Table();

    }
}
