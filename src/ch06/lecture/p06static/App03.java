package ch06.lecture.p06static;

public class App03 {
}

class MyClass03 {
    static String address;
    static int height;

    int age;
    String name;

    void action() {
        System.out.println(this.name + " 은 " + this.age + " 세 다.");
        this.go();
    }

    void go() {

    }

    static void work() {
        // static member 끼리 접근 가능
        System.out.println(address + "," + height);
        greeting();
    }

    void instanceMethod() {
        // instance Member method 에서 클래스 멤버 접근 가능
    }

    static void greeting() {

    }
}
