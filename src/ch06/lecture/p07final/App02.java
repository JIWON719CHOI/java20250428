package ch06.lecture.p07final;

public class App02 {
    public static void main(String[] args) {
        // static final field 예
        // integer 최대값, 최소값
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}

class MyClass02 {

    // static field에 final 적용 : 값을 한 번만 대입 가능
    // static field 명은 대문자로 작성(UPPER_SNAKE_CASE)
    final static int HEIGHT = 99;
    final static int WEIGHT;
    static final String COMPANY_NAME = "apple";

    static {
        WEIGHT = 100;
//        height = 101;//x
    }

    final int age;

    public MyClass02(int age) {
        this.age = age;
    }
}