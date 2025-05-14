package ch09.lecture.p04anonymous;

public class App02 {
    public static void main(String[] args) {
        MyInterface02 a = new MyClass02();
        a.action();

        MyInterface02 b = new MyInterface02() {
            @Override
            public void action() {
                System.out.println("App02.action");
            }
        };
        b.action();
    }
}

interface MyInterface02 {
    void action();
}

class MyClass02 implements MyInterface02 {
    @Override
    public void action() {
        System.out.println("MyClass02.action");
    }
}