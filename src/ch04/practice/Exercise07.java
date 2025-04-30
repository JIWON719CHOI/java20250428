package ch04.practice;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int bank = 0;

        while (run) {
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.println("선택> ");
            String strNum = scanner.nextLine().trim();

            switch (strNum) {
                case "1", "예금" -> {
                    System.out.println("잔고> " + bank);
                    System.out.println("예금액>");
                    int strNum2 = Integer.parseInt(scanner.nextLine());

                    if (strNum2 >= 0) {
                        bank += strNum2;
                        System.out.println("잔고> " + bank);
                    } else {
                        System.out.println("잘못된 금액입니다.");
                    }
                }
                case "2", "출금" -> {
                    System.out.println("잔고> " + bank);
                    System.out.println("출금액>");
                    int strNum2 = Integer.parseInt(scanner.nextLine());

                    if (strNum2 > bank) {
                        System.out.println("잔액이 부족합니다.");
                        System.out.println("잔고> " + bank);
                    } else if (strNum2 < 0) {
                        System.out.println("잘못된 금액입니다.");
                        System.out.println("잔고> " + bank);
                    } else {
                        bank -= strNum2;
                        System.out.println("잔고> " + bank);
                    }
                }
                case "3", "잔고" -> System.out.println("잔고>" + bank);
                case "4", "종료" -> run = false;
                default -> System.out.println("올바른 번호나 명령을 입력하세요.");
            }
        }
        System.out.println("프로그램 종료");
    }
}
