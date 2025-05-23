package ch11.lecture;

public class App19 {
    public static void main(String[] args) {
        try{
            method1();
        } catch (HungryException e) {
            e.printStackTrace();
        }
    }

    public static void method1()   {
        throw new HungryException("DINNER!");
    }
}

// 직접 필요한 exception 을 만들어 사용할 수 있음
class HungryException extends RuntimeException{
    HungryException() {
        super("JUST HUNGRY!");
    }
    HungryException(String message) {
        super("HUNGRY!");
    }
}
