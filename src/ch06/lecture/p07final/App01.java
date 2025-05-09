package ch06.lecture.p07final;

public class App01 {
    public static void main(String[] args) {

    }
}

class MyClass01 {

    final int weight = 10;
    final int height = 9;
    int age;

    MyClass01() {
        age = 3;
        age = 5;
    }

    void method1() {
        int a;
        a = 3;
        int b = 5;

        // 값을 바꿔 넣을 수 있음
        a = 7;
        b = 11;

        // final : 변수에 값을 한번만 넣을 수 있음
        final int c;
        c = 9;

        // 두번은 안됨
//        c = 11;
    }

    void method2(int a) {
        System.out.println(a);
        a = 9; // 가능
    }

    void method3(final int a) {
        System.out.println(a);
//        a = 9; // 안됨
    }
}
