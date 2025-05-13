package ch07.lecture.p06super;

public class App03 {
    public static void main(String[] args) {
        Child031 a = new Child031();
    }
}

class Parent03 {
    public Parent03(int a) {
        System.out.println("부모 필드 초기화");
    }
}

class Child031 extends Parent03 {
    public Child031() {
//        super(); // 내가 쓰지 않아도 자동으로 삽입되어 실행되는 코드.
        // 부모 클래스에 파라미터가 없는 생성자가 존재하지 않으면
        // 명시적으로 부모의 생성자 호출 코드를 작성해야 함.
        super(3);
        System.out.println("자식 필드 초기화");
    }
}
