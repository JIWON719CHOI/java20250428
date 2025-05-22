package ch11;

public class ExceptionDetailExample {

    public static void main(String[] args) {
        // 1. ArrayIndexOutOfBoundsException (런타임 예외)
        try {
            int[] numbers = {1, 2, 3};
            int value = numbers[5];  // 인덱스 초과
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 클래스 이름: " + e.getClass().getName());
            System.out.println("예외 메시지: " + e.getMessage());
            System.out.println("toString(): " + e.toString());
            System.out.println("원인: " + e.getCause());  // null (중첩 예외 없으면)
            System.out.println("스택 트레이스:");
            e.printStackTrace();
        }

        System.out.println("--------------------------------");

        // 2. NullPointerException
        try {
            String text = null;
            System.out.println(text.length()); // null 참조
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 발생: " + e.getMessage());
        }

        System.out.println("--------------------------------");

        // 3. ArithmeticException
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다: " + e.getMessage());
        }

        System.out.println("--------------------------------");

        // 4. NumberFormatException
        try {
            int num = Integer.parseInt("hello");
        } catch (NumberFormatException e) {
            System.out.println("숫자 변환 실패: " + e.getMessage());
        }

        System.out.println("--------------------------------");

        // 5. getCause() 활용 예 (중첩 예외)
        try {
            try {
                throw new NullPointerException("내부 null 오류");
            } catch (NullPointerException inner) {
                throw new RuntimeException("중첩된 예외 발생", inner);
            }
        } catch (RuntimeException e) {
            System.out.println("예외 메시지: " + e.getMessage());
            System.out.println("원인 예외 메시지: " + e.getCause().getMessage());
        }
    }
}