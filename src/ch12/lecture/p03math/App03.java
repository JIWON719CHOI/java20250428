package ch12.lecture.p03math;

import java.util.Random;

public class App03 {
    public static void main(String[] args) {
        // 두 개의 주사위를 던져서 나온 값들을 출력
        // 같은 값이면 당첨! 출력하고 종료

        Random random = new Random();

        while (true) {
            int d1 = random.nextInt(6) + 1;
            int d2 = random.nextInt(6) + 1;

            System.out.println(d1 + ", " + d2);
            if (d1 == d2) {
                System.out.println("당첨!");
                break;
            }
            System.out.println();
        }
    }
}