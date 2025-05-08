
package ch06.lecture.p04member;

public class App03 {
    public static void main(String[] args) {
        MyClass03 a = new MyClass03();
        MyClass03 b = new MyClass03();
        a.address = "seoul";
        b.address = "jeju";

        a.print();
        b.print();

    }
}

class MyClass03 {
    String address;

    void print() {
        System.out.println("주소: " + this.address);
    }
}
