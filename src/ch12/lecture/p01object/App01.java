package ch12.lecture.p01object;

import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        Object b = a;
        Object g = new MyClass01();

        String c = "java";
        Object d = c;
        Object h = "java";

        Scanner e = new Scanner(System.in);
        Object f = e;
        Object i = new Scanner("");


    }
}

// 모든 클래스는 Object의 하위 클래스
class MyClass01 extends Object {

}