package ch13.lecture.p00generic;

public class App09 {
    public static void main(String[] args) {
        MyClass09 a = new MyClass09();
        a.<Integer>action();
        a.<String>action();

        String v1 = a.<String>action1();
        String v2 = a.action1();

        a.<Integer>action2(3); // Integer
        a.action2(3); // Integer

        a.action2("java"); // String
    }
}

class MyClass09 {
    public <T> void action() {

    }

    public <T> T action1() {
        return null;
    }

    public <T> void action2(T param) {

    }
}