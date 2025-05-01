package ch04.practice;

public class C02For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        for (int i = 0; i <= 8; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("--------------------");

        for (int i = 0; i < 9; i += 2) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("--------------------");

        for (int i = 4; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("--------------------");

        for (int i = 1; i <= 5; i++) {
            System.out.println("*");
        }

        System.out.println("--------------------");

        for (int i = 1; i <= 5; i++) {
            System.out.println("*****");
        }
    }
}