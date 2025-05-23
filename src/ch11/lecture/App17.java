package ch11.lecture;

public class App17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (RuntimeException e) {
            System.out.println("Exception!");
        }
        System.out.println("Program running~");
    }

    public static void method1() {
        // my code
        // exception ! (throw)

        throw new RuntimeException();
    }
}
