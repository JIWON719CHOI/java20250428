package ch06.exercise.p20Short;

import java.util.Scanner;

public class BankApplication {

    static Account[] accounts = new Account[100];
    static int accountCount = 0;

    public static void main(String[] args) {
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

    private static void printHeader(String title) {
        System.out.println("-------");
        System.out.println(title);
        System.out.println("-------");
    }

    private static void createAccount(Scanner sc) {
        printHeader("계좌생성");
        System.out.print("계좌번호: ");
        String accNum = sc.nextLine();

        if (isDuplicateAccount(accNum)) {
            System.out.println("이미 존재하는 계좌번호입니다.");
            return;
        }

        System.out.print("계좌주: ");
        String name = sc.nextLine();

        System.out.print("초기입금액: ");
        int money;
        try {
            money = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해야 합니다.");
            return;
        }

        accounts[accountCount++] = new Account(accNum, name, money);
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private static void showAccounts() {
        printHeader("계좌목록");
        for (int i = 0; i < accountCount; i++) {
            System.out.println(accounts[i]);
        }
    }

    private static void deposit(Scanner sc) {
        printHeader("예금");
        System.out.print("계좌번호: ");
        String accNo = sc.nextLine();

        System.out.print("예금액: ");
        int amount;
        try {
            amount = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해야 합니다.");
            return;
        }

        Account acc = findAccount(accNo);
        if (acc != null) {
            acc.deposit(amount);
            System.out.println("결과: 예금이 성공되었습니다.");
        } else {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    private static void withdraw(Scanner sc) {
        printHeader("출금");
        System.out.print("계좌번호: ");
        String accNo = sc.nextLine();

        System.out.print("출금액: ");
        int amount;
        try {
            amount = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해야 합니다.");
            return;
        }

        Account acc = findAccount(accNo);
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

    private static Account findAccount(String accNo) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getNumber().equals(accNo)) {
                return accounts[i];
            }
        }
        return null;
    }

    private static boolean isDuplicateAccount(String accNo) {
        return findAccount(accNo) != null;
    }
}
