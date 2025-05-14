package ch16.lecture.p01lambda;

public class App02 {
    public static void main(String[] args) {
        // lambda : functional interface(추상 메소드가 하나인 인터페이스)의
        //          익명 클래스 객체
        MyInterface02 a = () -> {
            System.out.println("App02.method1");
        };
    }
}

// @FunctionalInterface : 이 인터페이스가 functional interface(추상 메소드가 하나)인지 검사
@FunctionalInterface
interface MyInterface02 {
    public void method1();

//    public void method2();
}