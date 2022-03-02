package hello.code.ch13;

public class Ex13_13 {
    public static void main(String[] args) {
        Runnable r = new RunnableEx12();
        new Thread(r).start();
        new Thread(r).start();
    }
}

class Acount2 {
    private int balance = 1000;

    public int getBalance() {
        return balance;
    }

    public synchronized void withdraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }

            balance -= money;
        }
    }
}

class RunnableEx13 implements Runnable {

    Acount ac = new Acount();

    @Override
    public void run() {
        while (ac.getBalance() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            ac.withdraw(money);
            System.out.println("balance = " + ac.getBalance());
        }
    }
}
