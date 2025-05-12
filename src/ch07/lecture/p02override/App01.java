package ch07.lecture.p02override;

public class App01 {
    public static void main(String[] args) {
        SubClass011 a = new SubClass011();
        a.action();
        a.hello();
        SubClass012 b = new SubClass012();
        b.action();

    }
}

class SupperClass01 {
    public void action() {
        System.out.println("Action!");
    }
}

class SubClass012 extends SupperClass01 {
    // 추가 메소드

    @Override
    public void action() {
        System.out.println("Sub");
    }

}

class SubClass011 extends SupperClass01 {

    // 상속받은 메소드를 다시 정의할 수 있음
    // @Override 애노테이션: 메소드를 잘 작성했는지 검증
    @Override
    public void action() {
        System.out.println("SubClass011.action");

    }

    public void hello() {
        System.out.println("Hello~");
    }
}
