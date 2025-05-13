package ch07.lecture.p08protected.sub1;

public class MyClass01 {
    //public
    public void method1() {
    }

    // protected
    protected void method2() {
    }

    // package private
    void method3() {
    }

    // private
    private void method4() {
    }

    public void action() {
        method1();
        method3();
        method4();
    }
}
