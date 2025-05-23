package ch11.sec06;

public class Account {
    private long balance;

    public Account() {}

    public long getBalance(){
        return balance;
    }

    public void deposit(int money){
        balance += money;
    }

    // 호출한 곳으로 예외 떠넘김
    public void withdraw(int money) throws InsufficientException{
        if (balance<money) throw new InsufficientException("잔고 부족: " + (money-balance)+ " 모자람!"); // 예외 발생
        balance -= money;
    }
}
