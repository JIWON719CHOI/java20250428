package ch16.lecture.p01lambda;

public class App08 {
    public static void main(String[] args) {
        MyInterface08 a = () -> System.out.println();
        MyInterface08 b = new MyInterface08() {
            @Override
            public void some() {
                System.out.println();
            }
        };
        MyClass08 o = new MyClass08();
        MyInterface08 c = () -> o.action(); // 형광펜에서 alt+enter ..
        MyInterface08 d = o::action;
        MyInterface08 e = o::action;
    }
}

class MyClass08 {
    void action() {
        System.out.println("MyClass08.action");
    }
}

interface MyInterface08 {
    void some();
}
