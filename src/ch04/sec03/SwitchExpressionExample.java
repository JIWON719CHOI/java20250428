package ch04.sec03;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> {
                System.out.println("손님 입니다.");
            }
        }

        switch (grade) { // 중괄호 안에 실행문이 하나만 있을 경우에는 중괄호를 생략 가능
            case 'A', 'a' -> System.out.println("우수 회원입니다.");
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            default -> System.out.println("손님 입니다.");

        }
    }
}
