package ch06.lecture.p02field;

public class App02 {
    public static void main(String[] args) {
        MyClass02 a = new MyClass02();
        a.address = "seoul";
        System.out.println(a.address);
        System.out.println(a.name);
        System.out.println(a.age);
    }
}

class MyClass02{
    //  필드 작성 시 기본값을 줄 수 있음 (권장되는 방식은 아님)
    String address;
    String name = "홍길동";
    int age = 1;
    String email = "없음";

}