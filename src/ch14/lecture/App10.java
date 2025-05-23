package ch14.lecture;


import java.util.concurrent.atomic.AtomicInteger;

public class App10 {
    public static void main(String[] args) throws InterruptedException {
        Box10 box = new Box10();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                box.increase();
            }
        });
        t2.start();

        t1.join();
        t2.join();

        int value = box.getValue();
        System.out.println("value = " + value);
    }
}

class Box10 {
    private AtomicInteger value;

    public Box10() {
        value = new AtomicInteger(0);
    }

    public int getValue() {
        return value.intValue();
    }

    public void increase() {
        value.incrementAndGet();
    }
}