package ch03.lecture;

public class C01Arithmetic {
    public static void main(String[] args) {
        // 산술연산자
        // +, -, *, /, %

        // +
        int a = 3;
        int b = 5;
        System.out.println("(a + b) = " + (a + b));
        // -
        int c = 7;
        int d = 2;
        System.out.println("(c - d) = " + (c - d));
        // *
        int e = 9;
        int f = 3;
        System.out.println("(e * f) = " + (e * f));
        // /
        int g = 10;
        int h = 3;
        System.out.println("(g / h) = " + (g / h));

        // % (modulo 연산, remainder 연산)
        int i = 10;
        int j = 4;
        System.out.println("(i % j) = " + (i % j));
    }
}