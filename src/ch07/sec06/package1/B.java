package ch07.sec06.package1; // 같은 패키지

public class B {
    // method
    public void method() {
        A a = new A(); // ok
        a.field = "value"; // ok
        a.method(); // ok
    }
}
