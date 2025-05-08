package ch06.lecture.p03method;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        a.action2();
        double b = a.action3();
        System.out.println("b = " + b);
        String s = a.action4();
        System.out.println("s = " + s);
        System.out.println("a.action5() = " + a.action5());
        System.out.println("다음 코드들...");

    }
}

class MyClass03 {
    void action1() {
        // 코드...

        // return
        // 1.메소드 종료
        // 2.오른쪽 값 호출한 곳으로 반환
    }

    void action2() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        if (true) {
            return; // 메소드 종료
        }
        System.out.println(4);
    }

    // 리턴타입과
    // return 문의 오른쪽 값 타입이 일치해야함.
    double action3() {
        System.out.println(99);
        System.out.println(88);
        return 3.14;
    }

    String action4() {
        return "hello";
    }

    int action5() {
        return 5;
    }

    int action6() {
        // 리턴타입을 명시하면 꼭 타입에 맞는 값을 리턴해야함.
        return 7;
    }

    void action7() {
        // 리턴할 값이 없다면 void 리턴타입 사용
    }

    int action8() {
        // 리턴문을 만나도록 코드 작성해야 함
        if (true) {
            return 10;
        }
        return 11;
    }
}