package ch08.sec07;

public interface Service {
    // default method
    default void defaultMethod1() {
        System.out.println("Service.defaultMethod1 종속 코드");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("Service.defaultMethod2 종속 코드");
        defaultCommon();
    }

    // private method
    private void defaultCommon() {
        System.out.println("Service.defaultMethod 중복 코드A");
        System.out.println("Service.defaultMethod 중복 코드B");
    }

    // static method
    static void staticMethod1() {
        System.out.println("Service.staticMethod1 종속 코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("Service.staticMethod2 종속 코드");
        staticCommon();
    }

    // private 정적 메소드
    private static void staticCommon() {
        System.out.println("Service.staticMethod 중복 코드C");
        System.out.println("Service.staticMethod 중복 코드D");
    }
}
