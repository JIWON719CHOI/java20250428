package ch06.lecture.p03method;

public class App04 {
    public static void main(String[] args) {
        MyClass04 a = new MyClass04();
        a.action();
        a.sum(3, 5, 0);
    }
}

class MyClass04 {
    void action() {
        System.out.println("어떤 코드");
    }

    // 같은 이름의 메소드 작성 가능
    void sum(int a, int b) {
        System.out.println("받을 값을 더함");
        System.out.println(a + b);
    }

    void sum(int a, int b, int c){
        System.out.println("여러 값을 더함");
        System.out.println(a+b+c);
    }
}
