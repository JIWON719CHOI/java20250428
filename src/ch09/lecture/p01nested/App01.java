package ch09.lecture.p01nested;

public class App01 {
    public static void main(String[] args) {
        MyClass01 a = new MyClass01();
        MyClass01.SubClass01 b = a.new SubClass01(); //거의 잘 안씀
    }
}

class MyClass01 {
    // class
    class SubClass01 {
    }

    // field
    SubClass01 a = new SubClass01();

    // constructor
    MyClass01() {
        a = new SubClass01();
    }

    // method
    void method() {
        SubClass01 a = new SubClass01();
    }
}
