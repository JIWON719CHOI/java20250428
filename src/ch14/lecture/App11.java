package ch14.lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class App11 {
    public static void main(String[] args) throws InterruptedException {
//        List<Integer> list = new ArrayList<>();
        List<Integer> list = new Vector<>();
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