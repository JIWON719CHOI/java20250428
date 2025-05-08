package ch06.lecture.p05constructor;

public class App07 {

}

class MyClass07 {
    String name;
    int age;
    String email;
    boolean married;

    public MyClass07() {
//        this.name = "홍길동";
//        this.age = 1;
//        this.email = "없음";
//        this.married = false;

        // this() : 다른 생성자 호출
        this("홍길동", 1, "없음", false);
    }

    public MyClass07(String name) {
//        this.name = name;
//        this.age = 1;
//        this.email = "없음";
//        this.married = false;

        this(name, 1, "없음", false);
    }

    public MyClass07(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.email = "없음";
//        this.married = false;

        this(name, age, "없음", false);
    }

    public MyClass07(String name, int age, String email) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//        this.married = false;

        this(name, age, email, false);
        System.out.println("추가 코드는 생성자 호출 코드 다음에...");
    }

    public MyClass07(String name, int age, String email, boolean married) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.married = married;
    }
}