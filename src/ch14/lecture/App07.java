package ch14.lecture;

public class App07 {
    public static void main(String[] args) throws InterruptedException {
        Box07 box = new Box07();
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

class Box07 {
    private int value;
    private Object object = new Object();

    public int getValue() {
        return value;
    }

    public void increase() {
        // synchronized block
        //  : (monitor) lock을 획득한 스레드만 실행 가능
        synchronized (object) {
            value++;
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        }
    }
}