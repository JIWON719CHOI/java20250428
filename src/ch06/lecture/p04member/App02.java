package ch06.lecture.p04member;

public class App02 {
    public static void main(String[] args) {

        MyClass02 a = new MyClass02();
    }
}

class MyClass02{
    // field
    String name;
    int age = 99;

    // method
    void print(){
        // local variable(지역 변수) : 메소드 내부에서 선언된 변수들
        int a= 3;
        String address = "seoul";
        String name = "Donald";

        // this : 멤버에 접근하기 위한 키워드
        // this.field
        // this.method()

        System.out.println("NAME: " + this.name);
        // 가리고 있는 지역 변수가 없으면 this 생략 가능
        System.out.println("this.age: " + age);
    }
}

