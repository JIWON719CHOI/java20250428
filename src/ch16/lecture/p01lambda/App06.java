package ch16.lecture.p01lambda;

public class App06 {
    public static void main(String[] args) {
        MyInterface06 a = () -> {
            System.out.println("code1");
            System.out.println("code2");
        };
        // 코드 한 줄이면 중괄호{} 생략 가능
        MyInterface06 b = () -> System.out.println("한줄코드");
    }
}

@FunctionalInterface
interface MyInterface06 {
    void action();
}