package ch12.lecture.p03math;

import java.util.Random;

public class App02 {
    public static void main(String[] args) {
        // Math.random() : 0.0d <= x < 1.0d 임의의 수 뽑기
        System.out.println(Math.random());
        double v = Math.floor(Math.random() * 6) + 1;
        System.out.println("🎲 = " + v);

        // Random : 임의의 수 뽑아주는 객체
        Random r = new Random();
        // nextDouble() : 0.0d <= x < 1.0d 임의의 수 뽑기
        double m = r.nextDouble();
        System.out.println("🎲🎲 = " + m);
        // nextInt() : 임의의 정수 (-21억~21억)
        int i = r.nextInt();
        System.out.println("🎲🎲🎲 = " + i);

        // nextInt(bound) : 0~bound-1 사이의 정수
    }
}
