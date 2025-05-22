package ch11.lecture;

public class App06 {
    public static void main(String[] args) {

        try {
            int[] arr = {5, 0};
            // IndexOutOfBoundsException
            // ArithmeticException
            int c = arr[0] / arr[1];
            System.out.println("GO!");
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            e.printStackTrace();
            System.out.println("⚠️");
        }

        System.out.println("🐕");
    }
}
