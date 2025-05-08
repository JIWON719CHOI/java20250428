package ch06.lecture.p03method;

public class App02 {
    public static void main(String[] args) {
        MyClass02 b = new MyClass02();
        b.go();
        b.action(0.15);
        b.work(4);
        int c = 10;
        b.work(c);

        // 정의된 파라미터에 맞는 순서, 타입, 갯수의 아규먼트 사용해야 함.
        b.greeting("hi", "java");
    }

}

class MyClass02 {
    void go() {

    }

    // 파라미터: 메소드 호출 시 값을 받는 변수
    void action(double x) {
        System.out.println("x = " + x); // 지역변수
    }

    void work(int x) {
        System.out.println("x = " + x);
    }

    void greeting(String a, String b) {

    }
}
