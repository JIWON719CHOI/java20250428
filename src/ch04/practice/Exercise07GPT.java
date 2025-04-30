package ch04.practice;

import java.util.Scanner;

public class Exercise07GPT {
    // 걍 모르면 외워. 이건 정해진 문법이야. 항상 main() 메서드 부터 시작.
    // public : 모든 곳에서 접근 가능
    // static : 객체 만들지 않아도 실행 가능. (즉, new 없이 실행 가능)
    // void : 이 메서드는 아무 값도 return 하지 않겠다는 뜻.
    // main : 자바 프로그램이 처음 시작하면 실행되는 약속된 이름.
    // String[] args : 프로그램 실행 시 외부에서 전달받는 문자열 배열 (명령행 인자)
    //                  -> 지금은 안써도 되고, 나중에 쓸 수 있음.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bank = 0;

        while (true) {
            System.out.println("\n----------------------------------"); // \n : 줄바꿈 해.
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");
            String choice = sc.nextLine().trim(); // trim() : 공백 입력 방지

            switch (choice) {
                case "1", "예금" -> { // java 14버전부터 가능
                    System.out.print("예금액> ");
                    int amount = parseAmount(sc);
                    //parseAmount()메서드 : 숫자 입력 예외 처리 코드 분리
                    //                     이거 밑에 private 으로 직접 만든거야.
                    if (amount >= 0) bank += amount;
                    else System.out.println("잘못된 금액입니다.");
                }
                case "2", "출금" -> {
                    System.out.print("출금액> ");
                    int amount = parseAmount(sc);
                    if (amount < 0) System.out.println("잘못된 금액입니다.");
                    else if (amount > bank) System.out.println("잔액이 부족합니다.");
                    else bank -= amount;
                }
                case "3", "잔고" -> System.out.println("잔고> " + bank);
                case "4", "종료" -> {
                    System.out.println("프로그램 종료");
                    return; // 종료를 간결하게.
                }
                default -> System.out.println("올바른 번호나 명령을 입력하세요.");
            }
        }
    }

    // private : 지금 이 클래스 여기서만 쓰는거임.
    // static  : main 메서드 처럼 객체 생성 없이 호출 할 수 있게 해줌
    private static int parseAmount(Scanner sc) {
        try { // 오류 코드를 실행해보기.
            return Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) { // 숫자가 아니면 이걸 실행.
            System.out.println("숫자를 정확히 입력하세요.");
            return -1; // 오류가 발생할때 특별값(-1)을 반환해 호출한 쪽에서 판단
            // 왜 -1을 쓰냐?
            // 메서드는 무조건 "어떤 값"을 반환(return) 해야 하기 때문
            // 숫자가 아닌 값을 다시 돌려주면 오류가 나니까 임의로 설정한 숫자.
            // -1은 일반적으로 "실패", "없음", "에러" 등을 나타내는 관례적인 숫자.
            // (꼭 -1일 필요는 없지만, 많이 씀)
        }
    }
}
