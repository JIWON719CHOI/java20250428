package ch04.lecture;

import java.awt.desktop.AboutEvent;

public class C15For {
    public static void main(String[] args) {
        // while

        int count = 0; // 카운트 변수 초기화

        boolean a = true;
        while (count < 3) { // 조건 확인
            System.out.println(1);
            System.out.println(2);
            count++; // 카운트 변수 증가
        }

        System.out.println("-----------------------------");

        // for 문
        for (int counnt = 0; count < 3; count++) {
            System.out.println(3);
            System.out.println(4);
            System.out.println(5);
        }
    }
}
