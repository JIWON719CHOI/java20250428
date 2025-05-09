package ch06.lecture.p08package;

import ch06.lecture.p08package.sub1.MyClass01;

import java.util.Scanner;

// java.lang 패키지는 import도 생략 가능
//import java.lang.System;
//import java.lang.String;

public class App04 {
    public static void main(String[] args) {
        // 다른 패키지에 있는 클래스는 full name을 써야 함
        // import 하면 생략 할 수 있음
        MyClass01 a = new MyClass01();

        // 예제 java.util.Scanner
        Scanner scanner = new Scanner(System.in);

        // 예제 java.lang.String
        String s = "java";

    }
}