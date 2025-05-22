package ch11.lecture;

public class App04 {
    public static void main(String[] args) {

        try {
            int a = 0;
            int b = 5;
            int c = b / a;
            System.out.println("GO!");
        } catch (ArithmeticException e) {
            //
            e.printStackTrace();
            System.out.println("⚠️");
        }

        System.out.println("🩷");
    }
}
