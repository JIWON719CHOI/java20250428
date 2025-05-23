package ch14.lecture;

public class App04 {
    public static void main(String[] args) throws InterruptedException {
        // join() : 특정 스레드가 끝나길 기다림
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println("Thread code");
            }
        });
        thread.start();
        thread.join(); // 스레드가 끝나길 기다림
        for (int i = 0; i < 10000; i++) {
            System.out.println("MAIN Thread");
        }
    }
}
