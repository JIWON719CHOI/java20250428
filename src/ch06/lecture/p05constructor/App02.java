package ch06.lecture.p05constructor;

public class App02 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        MyClass02 b = new MyClass02();
        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);
    }
}

class MyClass02 {
    // 필드
    String name;
    // 메소드

    // 생성자
    MyClass02() {
        // 객체 생성 시 해야하는 일들
        // 주로 필드 값을 초기화하는 일을 함
        this.name = "trump"; // this 생략가능
    }
}