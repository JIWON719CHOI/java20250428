package ch11.lecture;

public class App02 {
    public static void main(String[] args) {
        // try : exception 이 날 수 있는 코드
        // catch : exception 이 나면 실행될 코드
        try {
            int a = 0;
            int b = 5;
            int c = b / a; // ArithmeticException
            // exception 발생 시 catch block 으로 흐름이 넘어감

            System.out.println("GO!");
        } catch (Exception e) {
            System.out.println("⚠️ERROR CATCH!");
        }

        System.out.println("🧑‍💻");
    }
}
