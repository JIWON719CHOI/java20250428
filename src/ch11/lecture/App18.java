package ch11.lecture;

public class App18 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Go~~~");
    }
    public static void method1() throws Exception {

        // Exception Throws
        throw new Exception();
    }
}
