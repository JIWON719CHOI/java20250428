package ch06.lecture.p09access;

public class App02 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        a.age = 33;
//        a.name = "java";// x
    }
}

class MyClass02 {
    int age;

    // 객체 내에서만 접근 가능
    private String name;

    void action() {
        System.out.println(name);
    }
}