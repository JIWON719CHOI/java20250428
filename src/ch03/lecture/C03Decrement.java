package ch03.lecture;

public class C03Decrement {
    public static void main(String[] args) {
        // -- : 감소 연산자
        // 변수의 값에 1빼서, 변수에 대입
        int a = 10;
        a--;
        System.out.println("a = " + a); //9
        --a;
        System.out.println("a = " + a); //8
        // --가 뒤에 붙으면 나중에 연산
        System.out.println("a-- = " + a--); //8
        System.out.println("a = " + a); // 7
        // --가 앞에 붙으면 먼저 연산
        System.out.println("--a = " + --a); // 6
        System.out.println("a = " + a); // 6
    }
}
