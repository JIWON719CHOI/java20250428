package ch09.lecture.p04anonymous;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass011();
        a.action1();
        a.action2();

        // 익명 클래스의 객체
        MyClass01 b = new MyClass01() {
            // 추상 메소드 재정의

            @Override
            void action1() {
                System.out.println("App01.action1");
            }

            @Override
            void action2() {
                System.out.println("App01.action2");
            }
        };
        b.action1();
        b.action2();
    }
}

abstract class MyClass01 {
    abstract void action1();

    abstract void action2();
}

class MyClass011 extends MyClass01 {
    @Override
    void action1() {
        System.out.println("MyClass011.action1");
    }

    @Override
    void action2() {
        System.out.println("MyClass011.action2");
    }
}