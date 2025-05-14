package ch09.sec07.exam01;

public class Car {
    // field 에 Tire 객체 대입
    private Tire tire1 = new Tire();

    // field 에 익명 자식 객체 대입
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명 자식 Tire 객체 1 굴러감");
        }
    };

    // 메소드 (필드이용
    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    // method local variable
    public void run2() {
        // local variable = anonymous child object 대입
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 2 굴러감");
            }
        };
        tire.roll();
    }

    // method 매개 변수 이용
    public void run3(Tire tire) {
    }
}
