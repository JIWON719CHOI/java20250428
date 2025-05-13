package ch08.lecture.p03cast;

public class App01 {
    public static void main(String[] args) {
        MyInterface01 o = new MyClass01();
        o.action();
//        o.method(); // x

        // casting : 강제형변환
        MyClass01 a = (MyClass01) o; // 되긴 하는데 비추천.
        a.method();

    }
}

interface MyInterface01 {
    void action();
}

class MyClass01 implements MyInterface01 {
    @Override
    public void action() {
        System.out.println("MyClass01.action");
    }

    public void method() {
        System.out.println("MyClass01.method");
    }
}
