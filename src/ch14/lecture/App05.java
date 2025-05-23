package ch14.lecture;

public class App05 {
    public static void main(String[] args) {
        // Runnable 인터페이스 구현
        Thread thread = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                System.out.println("runnable");
            }
        });
        Thread myThread = new MyThread5();
        myThread.start();
        thread.start();
    }
}

// Thread 클래스 상속
class MyThread5 extends Thread{
    //run() 메소드 재정의
    @Override
    public void run(){
        for (int i = 0; i < 10000; i++) {
            System.out.println("Thread 상속코드");
        }
    }
}
