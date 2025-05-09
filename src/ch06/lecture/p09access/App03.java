package ch06.lecture.p09access;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
//        a.age = 33;
        a.name = "java";// ok
        a.address = "seoul"; // ok
    }
}

class MyClass03 {
    private int age;
    public String name;
    String address;

    void action() {
        System.out.println("age = " + age);
        System.out.println("name = " + name);
    }
}