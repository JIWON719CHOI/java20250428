package ch02.lecture;

public class C13Scope {
    public static void main(String[] args) {
        // 변수는 선언된 코드 블럭 안에서만 사용 가능
        // 안되는 건 주석 처리.
        int a = 3;

        System.out.println("a = " + a);

        if (true) {
            int b = 5;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        System.out.println("a = " + a);
//        System.out.println("b = " + b);
        if (true) {
            int b = 7;
//            int a = 9;
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
//        System.out.println("i = " + i);
        int i = 0;
        for (; i < 3; i++) {
            System.out.println("i = " + i);
        }
        
    }

}
