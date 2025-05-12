package ch06.exercise.p20ShortV2;

import java.util.*; // java.util 안에 있는 모든 도구(예: Scanner, Map, HashMap)를 쓰겠다는 뜻.

// 해쉬맵과 배열 조합으로 가독성과 성능 균형
public class BankApp {
    static Map<String, Account> accounts = new HashMap<>();
    // 모든 계좌들을 저장할 공간.
    // Map은 key-value 구조 (ex. "123-456" → 어떤 계좌 객체)
    // HashMap은 빠르게 찾아주는 Map 종류.
    // static은 "모든 메서드에서 공유됨"이란 뜻.
    static Scanner sc = new Scanner(System.in);
    //사용자의 입력을 받기 위한 도구: 키보드로 입력한 걸 읽어오는 Scanner를 System.in 으로 만듦.

    public static void main(String[] args) { // 코드 시작! 실행하면 제일 먼저 여기가 호출
        while (true) { // 무한반복 while... 5. 종료 까지.
            System.out.println("\n------------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택> ");
            switch (sc.nextLine()) { // sc.nextLine()은 한 줄 입력받는 거야.
                case "1" -> create();
                case "2" -> list();
                case "3" -> deposit();
                case "4" -> withdraw();
                case "5" -> {
                    System.out.println("프로그램 종료");
                    return;
                }
                default -> System.out.println("올바른 선택이 아닙니다.");
            }
        }
    }

    static void create() {
        System.out.print("번호: ");
        String no = sc.nextLine();
        if (accounts.containsKey(no)) { // 여기서 containsKey 가 어디서 선언되었나? 위에 HashMap 객체에 선언됨.
            // 👉 HashMap은 Map 이라는 인터페이스를 구현한 클래스고,
            // 👉 Map 에는 containsKey(key)라는 메서드가 기본으로 들어있어.
            System.out.println("이미 존재");
            return;
        }
        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("입금: ");
        int bal = Integer.parseInt(sc.nextLine()); // 숫자 문자열을 정수로 바꿔.
        accounts.put(no, new Account(no, name, bal)); // accounts 에 다 put 해라.
        System.out.println("계좌 생성"); // put(key, value) 는 맵에 저장하는 방법: 계좌번호가 key, Account가 value.
    }

    static void list() {
        accounts.values().forEach(System.out::println); // System.out::println은 각 계좌를 한 줄씩 출력하는 코드야.
    }

    static void deposit() {
        System.out.print("번호: ");
        String no = sc.nextLine();
        System.out.print("예금: ");
        int amt = Integer.parseInt(sc.nextLine());
        Account acc = accounts.get(no);
        if (acc != null) {
            acc.deposit(amt);
            System.out.println("예금 완료");
        } else System.out.println("계좌 없음");
    }

    static void withdraw() {
        System.out.print("번호: ");
        String no = sc.nextLine();
        System.out.print("출금: ");
        int amt = Integer.parseInt(sc.nextLine());
        Account acc = accounts.get(no);
        if (acc != null) {
            acc.withdraw(amt);
        } else System.out.println("계좌 없음");
    }

    static class Account { // 내부 클래스입니다. 계좌 객체를 정의. 계좌번호, 이름, 잔액을 저장.
        String no, name;
        int balance;

        Account(String no, String name, int balance) { // 계좌를 만들 때 어떤 값을 넣을지 정하는 생성자야.
            this.no = no;
            this.name = name;
            this.balance = balance;
        }

        void deposit(int amt) {
            balance += amt;
        }

        void withdraw(int amt) {
            if (balance >= amt) {
                balance -= amt;
                System.out.println("출금 완료");
            } else System.out.println("잔액 부족");
        }

        public String toString() { // overring 한거임.
            return no + " " + name + " " + balance + "원";
        }
    }
}
