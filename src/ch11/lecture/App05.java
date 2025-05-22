package ch11.lecture;

public class App05 {
    public static void main(String[] args) {
        try {
            int[] arr = {5, 0};
            int r = arr[1] / arr[0]; // IndexOutOfBoundsException or ArithmeticException
            System.out.println("Next Code....");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("⚠️배열의 인덱스 참조 잘못됨");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("⚠️0으로 나눌 때");
        }

        System.out.println("🩷🩷");

    }
}
