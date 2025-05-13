package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {
    // constructor
    public D() {
        // A constructor
        super(); // ok 상속을 통해서만 가능
    }

    // method
    public void method1() {
        // A field 값 변경
        this.field = "value"; // ok 상속을 통해서만 가능
        // A method 호출
        this.method(); // ok 상속을 통해서만 가능
    }

    // method
    public void method2() {
//        A a = new A(); // No! 직접 객체 생성해서 사용하는 것은 안됨.
//        a.field = "value"; // No! 직접 객체 생성해서 사용하는 것은 안됨.
//        a.method(); // No! 직접 객체 생성해서 사용하는 것은 안됨.
    }
}
