package ch08.lecture.p05extends;

public class App01 {
    public static void main(String[] args) {
        
    }

}

//@formatter:off
interface MyInterface01{}
interface MyInterface02{}
class MyClass01 implements MyInterface01, MyInterface02{}

interface MyInterface03 extends MyInterface01, MyInterface02{}
interface MyInterface04 extends MyInterface02{}

class MyClass02 implements MyInterface03{}
