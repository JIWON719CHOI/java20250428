package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String[] data) {
//        int result = data.length(); // NullPointerException
//        System.out.println("Type:" + result);
    }

    public static void main(String[] args) {
        System.out.println("START!\n");
//        printLength("JAVA");
        printLength(null); // 매개값으로 null 대입
        System.out.println("EXIT!");
    }
}
