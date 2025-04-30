package ch04.lecture;

public class C14DoWhile {
    public static void main(String[] args) {
        // while : ()조건 확인 후 {} 실행 -> () 조건확인

        // do while : {} 실행 후 ()확인 -true-> {}실행

        boolean a = true; // 이건 컴파일러 속이는....거
        System.out.println("code1");
        do {
            System.out.println("code2");
            System.out.println("code3");
        } while (a);

        System.out.println("code4");
        System.out.println("code5");
    }
}
