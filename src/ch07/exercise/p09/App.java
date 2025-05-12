package ch07.exercise.p09;

//@formatter:off
class A { }

class B extends A {}
class C extends A {}
class D extends B {}
class E extends B {}
class F extends C {}
//@formatter:on

public class App {
    public static void main(String[] args) {
        B b = new B();
        B b1 = (B) new A();
        B b2 = new D();
        B b3 = new E();
    }

    // 메소드 선언
    void method(B b) {
    }

}
