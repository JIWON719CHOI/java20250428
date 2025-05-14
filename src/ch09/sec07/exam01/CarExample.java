package ch09.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        // Car object
        Car car = new Car();

        // anonymous object = field 사용
        car.run1();
        // anonymous object = local variable 사용
        car.run2();
        // anonymous object = 매개 변수 사용

        car.run3(new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 Tire 객체 3 굴러감");
            }
        });
    }
}

