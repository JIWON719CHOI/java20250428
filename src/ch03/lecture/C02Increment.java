package ch03.lecture;

public class C02Increment {
    public static void main(String[] args) {
        // ++ : 증가 연산자
        // 변수의 값에 1 더한 후, 변수에 다시 대입

        int a = 10;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);

        // ++가 뒤에 붙으면 나중에 연산
        System.out.println("a++ = " + a++); // 11
        System.out.println("a = " + a); // 12

        // ++가 앞에 붙으면 먼저 연산
        System.out.println("++a = " + ++a); // 13
        System.out.println("a = " + a); // 13

        //
        a++;
        System.out.println("a = " + a); // 14
//        System.out.println("++a = " + ++a); // 14 이건 별로 가독성이 안좋아서 잘 안씀.

    }
}
