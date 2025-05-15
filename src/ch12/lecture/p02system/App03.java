package ch12.lecture.p02system;

public class App03 {
    public static void main(String[] args) {
        // nanoTime() : 프로그램 실행 시간 측정을 위한 메소드

        long start = System.nanoTime();
        System.out.println("START");
        long end = System.nanoTime();
        long result = end - start;
        System.out.println("result = " + result);
    }
}
