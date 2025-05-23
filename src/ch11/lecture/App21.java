package ch11.lecture;

public class App21 {
    public static void main(String[] args) {

        method2();
    }

    public static void method2() {

        // checked Exception 을 unchecked Exception 감싸서 다시 던지기
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

    public static void method1() throws Exception {

    }
}