package ch14.lecture;

import java.util.*;

public class App12 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> l = new ArrayList<>();
//        List<Integer> list = new Vector<>();
        List<Integer> list = Collections.synchronizedList(l);

        Random random = new Random();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(random.nextInt());
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(random.nextInt());
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(list.size());
    }
}