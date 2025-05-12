package ch07.sec09;

public class Person {
    // field 선언
    public String name;

    // 생성자 선언
    public Person(String name) {
        this.name = name;
    }

    // 메소드 선언
    public void walk() {
        System.out.println("WALK.");
    }
}
