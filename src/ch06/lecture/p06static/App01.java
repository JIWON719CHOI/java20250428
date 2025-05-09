package ch06.lecture.p06static;

public class App01 {
    public static void main(String[] args) {
        MyClass1 a = new MyClass1();
        a.name = "donald";
        a.age = 77;

        MyClass1 b = new MyClass1();
        b.name = "musk";
        b.age = 55;

        a.work();
        b.work();

//        MyClass1.name = "abc"; // 인스턴스 멤버는 클래스 이름으로 접근할 수 없음

        MyClass1.address = "USA"; // 클래스 멤버는 가능함
    }

}

class MyClass1 {
    // 멤버 ( 필드, 메소드, 생성자?)

    // 필드, 멤버 필드, 인스턴스 필드
    String name;
    int age;

    // 클래스 필드
    static String address;

    // 메소드 , 멤버 메소드, 인스턴스 필드

    void work() {
        System.out.println(this.age + " 세 의 " + this.name + " 가 일한다.");
    }

    // 클래스 메소드
    static void print() {
        System.out.println(address + " 에 삽니다.");
    }
}
