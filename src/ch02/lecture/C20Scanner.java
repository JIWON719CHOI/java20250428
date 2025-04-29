package ch02.lecture;

import java.util.Scanner;

public class C20Scanner {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 값");
        String a = scanner.nextLine();

        System.out.println("두번째 값");
        String b = scanner.nextLine();

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        String c = a + b;
        System.out.println("c = " + c);

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int result = num1 + num2;
        System.out.println("result = " + result);

        System.out.println("프로그램 종료");
    }
}
