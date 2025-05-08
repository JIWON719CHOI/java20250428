package ch06.lecture.p05constructor;

public class App04 {
}

// class MyClass42 작성
// 5개의 필드 만들고
// 필드 초기화 하는 생성자 작성해보기
class MyClass42 {
    String name;
    String nickName;
    int age;
    boolean done;
    double score;

    public MyClass42(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
}

class MyClass41 {
    String name;
    String address;
    int age;
    boolean married;

    public MyClass41(String name, String address, int age, boolean married) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.married = married;
    }
}