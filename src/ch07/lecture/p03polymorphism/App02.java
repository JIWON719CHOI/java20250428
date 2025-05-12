package ch07.lecture.p03polymorphism;

public class App02 {
    public static void main(String[] args) {
        SuperClass02 a = new SuperClass02();
        SubClass021 b = new SubClass021();
        SubClass022 c = new SubClass022();
        SubClass023 d = new SubClass023();
        SubClass024 e = new SubClass024();

        // 자동형변환

        // b
        SubClass021 f = b;
        SuperClass02 g = f;

        // c
        SubClass022 h = c;
        SuperClass02 i = h;

        // d
        SubClass023 j = d;
        SubClass021 k = d;
        SuperClass02 l = d;

        // e
        SubClass024 m = e;
        SubClass022 n = e;
        SuperClass02 o = e;

    }
}

// @formatter:off
class SuperClass02 {}
class SubClass021 extends SuperClass02 {}
class SubClass022 extends SuperClass02 {}

class SubClass023 extends SubClass021 {}
class SubClass024 extends SubClass022 {}
// @formatter:on