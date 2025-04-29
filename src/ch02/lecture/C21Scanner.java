package ch02.lecture;

import java.util.Scanner;

public class C21Scanner {
    public static void main(String[] args) {
        System.out.println("두 값 더하는 프로그램");
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 값");
        String n = scanner.nextLine();

        System.out.println("두번째 값");
        String m = scanner.nextLine();

        int i = Integer.parseInt(n);
        int j = Integer.parseInt(m);

        int r = i + j;
        System.out.println("더한값 = " + r);

        System.out.println("프로그램 종료");

    }
}
