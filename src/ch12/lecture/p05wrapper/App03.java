package ch12.lecture.p05wrapper;

public class App03 {
    public static void main(String[] args) {
        int a = 3;
        Integer b = a;// boxing

        Object c = b; // ok

        Object d = 3; // ok ???
    }
}
