package ch09.sec04.exam03;

public class A {
    // method
    public void method1(int arg) { // final int arg
        // local variable
        int var = 1; // final int var = 1;

        // local class
        class B {
            // method
            void method2() {
                // local variable 읽기
                System.out.println("arg = " + arg); // o
                System.out.println("var = " + var); // o

                // local variable 수정 하지마..
//                arg = 2;
//                var = 2;

            }
        }
        // 로컬 객체 생성
        B b = new B();
        // local object method call
        b.method2();

        // local variable edit DON'T!!
        // arg = 3;
        // var = 3;
    }

}
