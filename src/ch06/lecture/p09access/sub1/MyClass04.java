package ch06.lecture.p09access.sub1;

public class MyClass04 {
    private int age;
    public String email;

    // package private
    String home;

    void method() {
        System.out.println("age = " + age);
        System.out.println("email = " + email);
        System.out.println("home = " + home);
    }
}