package ch07.lecture.p05abstract;

public class App02 {
    public static void main(String[] args) {
        Canids02 a = new Chihuahua02();
        a.bark(); // 깨갱

        Canids02 b = new Wolf02();
        b.bark(); // 아우~~~~
    }
}

// 개과
// 추상 메소드가 있으면 반드시 추상 클래스 이어야 함
abstract class Canids02 {
    // abstract method(추상메소드) : 몸통(body) 메소드
    public abstract void bark();
}

class Chihuahua02 extends Canids02 {
    @Override
    public void bark() {
        System.out.println("깨갱");
    }
}

class Wolf02 extends Canids02 {
    @Override
    public void bark() {
        System.out.println("아우~~~~~");
    }
}