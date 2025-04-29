package ch02.lecture;

public class C15Casting {
    public static void main(String[] args) {
        // 작은 타입 -> 큰 타입은 문제 없음

        // 큰 타입 -> 작은 타입 (문제 있을 수 있어서 매우 조심!!)

        byte a;
        short b;
        b = 100;
        System.out.println("b = " + b);

//        a = b; // 기본적으론 안됨.
        // 강제로 하기.
        a = (byte) b;
        System.out.println("a = " + a);

        b = 128;
//        a = b;
        a = (byte) b;
        System.out.println("b = " + b);
        System.out.println("a = " + a); // 왜? 

        b = 987;
        a = (byte) b;
        System.out.println("b = " + b);
        System.out.println("a = " + a); // byte 가 담을 수 있는 값은 한계가 있기 때문에 값을 잃어버림.

        // 실수형 -> 정수형
        double c = 123.456;
        //강제로
        int d = (int) c; //type casting

        System.out.println("c = " + c);
        System.out.println("d = " + d);


    }
}
