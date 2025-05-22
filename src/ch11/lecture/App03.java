package ch11.lecture;

public class App03 {
    public static void main(String[] args) {

        try {
            int[] arr = {4, 1};
            System.out.println(arr[2]);
            System.out.println("GO!");
        } catch (IndexOutOfBoundsException e) {
            String message = e.getMessage();
            System.out.println("message = " + message);
            Throwable cause = e.getCause();
            System.out.println("cause = " + cause);
            for (StackTraceElement stackTraceElement : e.getStackTrace()) System.out.println("⚠️");
        }
        System.out.println("🩷");
    }
}
