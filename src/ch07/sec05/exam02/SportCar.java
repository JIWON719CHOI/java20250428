package ch07.sec05.exam02;

public class SportCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    // 오버라이딩 불가능
//    @Override
//    public void stop(){
//        System.out.println("Stop the SportCar");
//        speed = 0;
//    }
}
