package ch12.lecture.p02system;

public class App02 {
    public static void main(String[] args) {
        // currentTimeMillis() : 현재 시간
        long t1 = System.currentTimeMillis();
        System.out.println("t1 = " + t1);
        System.out.println("프로그램 진행...");

        long t2 = System.currentTimeMillis();
        System.out.println("t2 = " + t2);

        System.out.println(t2 - t1);
    }
}