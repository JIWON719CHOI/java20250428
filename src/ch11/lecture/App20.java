package ch11.lecture;

public class App20 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (AngryException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws AngryException {
        throw new AngryException("HEY!");
    }
}


// 직접 만든...
class AngryException extends Exception {
    public AngryException() {
        super("JUST..");
    }

    public AngryException(String message) {
        super(message);
    }
}
