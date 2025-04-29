package ch02.lecture;

import java.util.Scanner;

public class C19Scanner {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        // 커서를 이동하면서 입력된 값을 읽어냄
        Scanner scanner = new Scanner(System.in);

        // 엔터를 만날 때 까지 읽은 내용을 리턴함
        String s = scanner.next();
        System.out.println("s = " + s);

        String t = scanner.nextLine();
        System.out.println(t);


        System.out.println("프로그램 종료");


    }
}
