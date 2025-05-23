package ch14.lecture;

public class App03 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(1);
        Thread.sleep(500); // 0.5초
        System.out.println(2);

        Thread.sleep(1000); // ms 단위

        System.out.println(3);
        Thread.sleep(2000); // 2초
        System.out.println(4);
    }
}