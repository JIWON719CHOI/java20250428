package ch02.lecture;

public class C05Integer {
    public static void main(String[] args) {
        // 정수형
        // byte (1 byte)
        byte a;
        a = 127;
        a = -128;
        System.out.println(a);
        System.out.println("a = " + a);

        // short (2 bytes)
        short b;
        b = 32767;
        System.out.println("b = " + b);
        b = -32767;
        System.out.println("b = " + b);
        // int (4 bytes)
        int c;
        c = 2147483647;
        System.out.println("c = " + c);
        c = -2147483648;
        System.out.println("c = " + c);

        // long (8 bytes)
        long d;
        d = 9223372036854775807L;
        d = -9223372036854775807L;

        // java 코드에서 정수(literal)는 int로 해석됨.
        // long type literal 은 끝에 L(l) 붙여야 함.
    }
}
