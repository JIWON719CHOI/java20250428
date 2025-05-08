package ch06.lecture.p04member;

public class App04 {
    public static void main(String[] args) {
        MyClass04 a = new MyClass04();
        a.name = "donald";

        MyClass04 b = new MyClass04();
        b.name = "trump";

        a.action("도날드");
        b.action("트럼프");
    }
}

class MyClass04 {
    String name;

    void action(String name) {

        System.out.println("name = " + name);
        System.out.println("this.name = " + this.name);
    }
}