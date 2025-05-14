package ch09.lecture.p03interface;

public class App01 {
    public static void main(String[] args) {
        class Some implements MyClass01.MyInterface1 {
            @Override
            public void action() {
                System.out.println("Some.action");
            }
        }
    }
}

// 종종 있음
class MyClass011 implements MyClass01.MyInterface1 {
    @Override
    public void action() {
        System.out.println("MyClass011.action");
    }
}

class MyClass01 {
    // class
    // interface
    interface MyInterface1 {
        void action();
    }

    // field
    // constructor
    // method
    void method() {
        class SomeClass implements MyInterface1 {

            @Override
            public void action() {
                System.out.println("SomeClass.action");
            }
        }
        MyInterface1 a = new SomeClass();
        a.action();
    }
}
