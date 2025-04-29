package ch03.lecture;

public class C05Overflow {
    public static void main(String[] args) {
        int a = 10_0000_0000;
        System.out.println(a);
        a = a * 2;
        System.out.println(a);
        a = a * 2;
        System.out.println(a); // 4 bytes 공간으로 약 21억 이상을 넘기지 못한다.

        long b = 10_0000_0000L;
        System.out.println(b);
        b = b * 4;
        System.out.println(b);

    }
}
