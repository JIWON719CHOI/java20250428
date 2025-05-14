package ch08.lecture.p06etc;

public class App02 {
}

interface MyInterface02 {
    void action();

    // default method : 인터페이스에 있는 body 가 있는 인스턴스 메소드(추상메소드가 아님)
    default void method() {
        System.out.println("MyInterface02.method");
    }

    // default 메소드도 항상 public
    public default void hello() {
        System.out.println("MyInterface02.hello");
    }
}

class MyClass021 implements MyInterface02 {
    @Override
    public void action() {
        System.out.println("MyClass021.action");
    }

    // 필요하면 default 메소드 재정의 가능
    @Override
    public void method() {
        System.out.println("MyClass021.method");
    }
}

class MyClass022 implements MyInterface02 {
    @Override
    public void action() {
        System.out.println("MyClass022.action");
    }
}