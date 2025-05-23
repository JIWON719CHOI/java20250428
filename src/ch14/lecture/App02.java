package ch14.lecture;

import java.awt.*;

public class App02 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();

            for (int i = 0; i < 5; i++) {
                toolkit.beep();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띠리링");

            Thread.sleep(1000);
        }
    }
}