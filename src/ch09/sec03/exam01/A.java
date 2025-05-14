package ch09.sec03.exam01;

public class A {
    // instance member class
    static class B {
    }

    // instance field 값으로 B 객체 대입
    B field1 = new B();

    // static field 값으로 B 객체 대입
    static B field2 = new B();

    // constructor
    A() {
        B b = new B();
    }

    // static method
    static void method2() {
        B b = new B();
    }
}
