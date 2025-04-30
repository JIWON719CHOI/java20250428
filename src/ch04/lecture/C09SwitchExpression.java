package ch04.lecture;

import java.util.Scanner;

public class C09SwitchExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수");
        int score = Integer.parseInt(scanner.nextLine());

//        System.out.println("score = " + score);
        String message;
        switch (score) {
            case 100 -> {
                message = "참 잘했어요.";
            }
            case 90 -> {
                message = "잘했어요.";
            }
            case 80 -> {
                message = "좋아요.";
            }
            default -> {
                message = "가능성이 있어요.";
            }
        }
        System.out.println(message);

        // switch expression
        // default 생략 불가
        String message2 = switch (score) {
            case 100 -> "참 잘했어요.";
            case 90 -> "잘했어요.";
            case 80 -> {
                int a = 3;
                int b = 5;
                // 최종값 산출 시
                // 여러 명령문이 필요하면
                // {}으로 묶고
                // 마지막에 yield 로 값 산출
                yield "좋아요";
            }
            default -> "가능성이 있어요.";
        };
    }
}
