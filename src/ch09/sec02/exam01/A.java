package ch09.sec02.exam01;

public class A {
    // instance member class
    class B {
    }

    // instance field 값으로 B 객체 대입
    B field = new B();

    // constructor
    A() {
        B b = new B();
    }

    // instance method
    void method() {
        B b = new B();
    }
}
