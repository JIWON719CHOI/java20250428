package ch07.lecture.p04cast;

public class App04 {
    public static void main(String[] args) {
        SubClass041 a = new SubClass041();
        // 자동형변환
        SuperClass04 b = a;

        // 강제형변환 가능
        SubClass041 c = (SubClass041) b;

        // 강제형변환 불가능
        SubClass042 d = (SubClass042) b;

        System.out.println("프로그램 종료");
    }
}

// @formatter:off
class SuperClass04 {}
class SubClass041 extends SuperClass04 {}
class SubClass042 extends SuperClass04 {}
// @formatter:on