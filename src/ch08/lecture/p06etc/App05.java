package ch08.lecture.p06etc;

public class App05 {
    public static void main(String[] args) {
//        MyInterface05.common();
    }

}

interface MyInterface05 {
    static void action1() {
        System.out.println("MyInterface05.action1");
    }

    default void action2() {
        System.out.println("MyInterface05.action2");
        common();
    }

    // private 인스턴스 메소드
    private static void common() {
        System.out.println("MyInterface05.common");
    }
}


