package ch06.lecture.p05constructor;

public class App05 {

}

class MyClass05 {
    String name;
    String email;
    int age;
    boolean done;

    // 생성자는 여러 개 만들 수 있음
    // 여러 생성자는 파라미터 갯수, 타입, 순서가 달라야함

    public MyClass05(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public MyClass05(int age, boolean done) {
        this.age = age;
        this.done = done;
    }

    public MyClass05(String name) {
        this.name = name;
    }

//    public MyClass05(String email) {
//        this.email = email;
//    }

// alt + insert 단축키로 생성하고자 하는 constructor 를 ctrl 로 다중 선택하여 자동 생성 가능
    public MyClass05(String name, String email, int age, boolean done) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.done = done;
    }
}