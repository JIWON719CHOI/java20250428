package ch16.lecture.p01lambda;

public class App05 {
    public static void main(String[] args) {
        MyInterface05 o = (x) -> {
            System.out.println(x + "이다");
            System.out.println(x + "입니다.");
        };

        // 파라미터 목록이 하나면 () 생략 가능
        MyInterface05 s = x -> {
            System.out.println(x + "이다");
            System.out.println(x + "입니다.");
        };

        MyInterface05 t = x -> System.out.println(x + "이다");
    }
}

@FunctionalInterface
interface MyInterface05 {
    void method(int a);
}