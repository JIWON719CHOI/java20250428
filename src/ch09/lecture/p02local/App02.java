package ch09.lecture.p02local;

public class App02 {
    void some() {
        // local variable
        // effectively final
        int a = 5;


        class MyClass {
            void action() {
                // 감싸고 있는 메소드(some)의 지역변수(a)를 사용한다면
                // 그 지역변수(a)는 값이 변경되면 안됨
                System.out.println(a);
            }
        }
//        a = 6; // 값 변경 안됨
    }
}
