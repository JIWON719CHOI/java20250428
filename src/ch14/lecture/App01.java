package ch14.lecture;

public class App01 {
    public static void main(String[] args) {
        // Thread 객체를 만들어서 실행
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("내가 Thread의 실행 코드");
            }
        });

        thread.start();


        for (int i = 0; i < 10000; i++) {
            System.out.println("@메인 Thread의 실행코드");

        }
    }
}