package ch06.exercise.p20GPT;

public class Account2 {
    private final String number; // 계좌번호
    private final String name;   // 계좌주 이름
    private int balance;         // 잔액

    public Account2(String number, String name, int balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}

