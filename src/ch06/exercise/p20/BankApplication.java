package ch06.exercise.p20;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[100];
        int numberOfAccount = 0;
        boolean run = true;
        while (run) {
            System.out.println("------------------------------");
            System.out.println("1.생성|2.목록|3.예금|4.출금|5.종료");
            System.out.println("------------------------------");
            System.out.print("선택>");
            String menu = scanner.nextLine();

            switch (menu) {
                case "1" -> {
                    // 계좌생성
                    System.out.println("-------");
                    System.out.println("계좌생성");
                    System.out.println("-------");
                    System.out.print("계좌번호:");
                    String number = scanner.nextLine();
                    System.out.print("계좌주:");
                    String name = scanner.nextLine();
                    System.out.print("초기입금액:");
                    int balance = Integer.parseInt(scanner.nextLine());

                    Account account = new Account(number, name, balance);
                    accounts[numberOfAccount] = account;
                    numberOfAccount++;
                    System.out.println("결과: 계좌가 생성되었습니다.");
                }
                case "2" -> {
                    // 계좌목록보기
                    System.out.println("-------");
                    System.out.println("계좌목록");
                    System.out.println("-------");
                    for (int i = 0; i < numberOfAccount; i++) {
                        Account a = accounts[i];
                        System.out.println(a.getNumber() + "\t" + a.getName() + "\t" + a.getBalance());
                    }
                }
                case "3" -> {
                    // 예금
                    System.out.println("-------");
                    System.out.println("예금");
                    System.out.println("-------");
                    System.out.print("계좌번호:");
                    String number = scanner.nextLine();
                    System.out.print("예금액:");
                    int money = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < numberOfAccount; i++) {
                        if (accounts[i].getNumber().equals(number)) {
                            accounts[i].setBalance(accounts[i].getBalance() + money);
                        }
                    }
                    System.out.println("예금이 성공되었습니다.");

                }
                case "4" -> {
                    // 출금
                    System.out.println("-------");
                    System.out.println("출금");
                    System.out.println("-------");
                    System.out.print("계좌번호:");
                    String number = scanner.nextLine();
                    System.out.print("출금액:");
                    int money = Integer.parseInt(scanner.nextLine());

                    for (int i = 0; i < numberOfAccount; i++) {
                        if (accounts[i].getNumber().equals(number)) {
                            accounts[i].setBalance(accounts[i].getBalance() - money);
                        }
                    }
                    System.out.println("출금이 성공되었습니다.");
                }
                case "5" -> {
                    // 종료
                    run = false;
                }
            }
        }
        System.out.println("프로그램 종료");
    }
}