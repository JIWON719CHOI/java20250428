package ch08.lecture.p01interface;

public class App02 {
    public static void main(String[] args) {
        Child021 a = new Child021();
        Parent02 b = a;

        MyClass02 c = new MyClass02();
        MyInterface02 d = c; // 자동형변환
        MyInterface01 e = c; // 자동형변환

        Child022 f = new Child022();
        Parent02 g = f; // 자동형변환
        MyInterface01 h = f; // 자동형변환
        MyInterface02 i = f; // 자동형변환

    }
}


// @formatter:off
// interface : 클래스의 새로운 타입을 정의
interface MyInterface02 { }
class Parent02 { }
// 클래스 상속은 하나만 가능
class Child021 extends Parent02 { }
// 인터페이스 구현은 여러개 가능
class MyClass02 implements MyInterface02, MyInterface01 { }
class Child022 extends Parent02 implements MyInterface01, MyInterface02 { }