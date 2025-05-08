package ch06.lecture.p05constructor;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03("musk", 66, "texas");
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.address);

        MyClass03 b= new MyClass03("donald", 88, "LA");
        System.out.println(b.name);
        System.out.println(b.age);
        System.out.println(b.address);

    }
}

class MyClass03 {
    /// 아래 3개의 순서는 상관이 없지만 관습적으로 아래와 같이 사용.

    // field
    String name;
    int age;
    String address;

    // constructor
    MyClass03(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // method
}
