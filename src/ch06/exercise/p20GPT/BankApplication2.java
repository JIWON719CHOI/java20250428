package ch06.exercise.p20GPT;

import java.util.Scanner;

public class BankApplication2 {
    static Account2[] account = new Account2[100];
    static int accountCount = 0; // 등록된 계좌 갯수 기록

    public static void main(String[] args) { // 프로그램 시작!
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n---------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1" -> createAccount(sc);
                case "2" -> showAccounts();
                case "3" -> deposit(sc);
                case "4" -> withdraw(sc);
                case "5" -> {
                    System.out.println("프로그램 종료");
                    return;
                }
                default -> System.out.println("올바른 선택이 아닙니다.");
            }
        }
    }

    private static void createAccount(Scanner sc) {
        System.out.println("-------");
        System.out.println("계좌생성");
        System.out.println("-------");
        System.out.print("계좌번호: ");
        String accNum = sc.nextLine();
        System.out.print("계좌주: ");
        String name = sc.nextLine();
        System.out.print("초기입금액: ");
        int money = Integer.parseInt(sc.nextLine());

        account[accountCount++] = new Account2(accNum, name, money);
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private static void showAccounts() {
        System.out.println("-------");
        System.out.println("계좌목록");
        System.out.println("-------");
        for (int i = 0; i < accountCount; i++) {
            Account2 acc = account[i];
            System.out.printf("%s %s %d원%n", acc.getNumber(), acc.getName(), acc.getBalance());
        }
    }

    private static void deposit(Scanner sc) {
        System.out.println("-------");
        System.out.println("예금");
        System.out.println("-------");
        System.out.print("계좌번호: ");
        String accNo = sc.nextLine();

        System.out.print("예금액: ");
        int amount = Integer.parseInt(sc.nextLine());

        Account2 acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amount);
            System.out.println("결과: 예금이 성공되었습니다.");
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    private static void withdraw(Scanner sc) {
        System.out.println("-------");
        System.out.println("출금");
        System.out.println("-------");
        System.out.print("계좌번호: ");
        String accNo = sc.nextLine();

        System.out.print("출금액: ");
        int amount = Integer.parseInt(sc.nextLine());

        Account2 acc = findAccount(accNo);
        if (acc != null) {
            if (acc.getBalance() >= amount) {
                acc.withdraw(amount);
                System.out.println("결과: 출금이 성공되었습니다.");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    private static Account2 findAccount(String accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (account[i].getNumber().equals(accNo)) {
                return account[i];
            }
        }
        return null;
    }
}
