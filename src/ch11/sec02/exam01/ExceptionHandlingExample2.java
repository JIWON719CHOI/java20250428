package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {
    public static void printLength(String data) {
        try{
            int result = data.length(); //data가 null일 경우 NullPointerException 발생
            System.out.println("Type: " + result);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage()); // 예외정보를 얻는 3가지 방법
//            System.out.println(e.toString());
//            e.printStackTrace();
        } finally {
            System.out.println("finally\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("Start!\n");
        printLength("J");
        printLength(null);
        System.out.println("EXIT!");
    }
}
