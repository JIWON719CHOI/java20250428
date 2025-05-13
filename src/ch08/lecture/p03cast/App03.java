package ch08.lecture.p03cast;

public class App03 {
    public static void main(String[] args) {
        MyInterface03 a = new MyClass031();
        // instanceof 연선자: 왼쪽에 참조변수, 오른쪽에 타입
        // 참조변수가 가리키는 인스턴스(객체) 오른쪽 타입이면 true
        // 아니면 false


        if (a instanceof MyClass031) {
            System.out.println("Work?");
            MyClass031 b = (MyClass031) a; // ok
        }

        if (a instanceof MyClass032) {
            System.out.println("Work?");
            MyClass032 c = (MyClass032) a; // x
        }
    }
}

//@formatter:off
interface MyInterface03{}
class MyClass031 implements MyInterface03{}
class MyClass032 implements MyInterface03{}
