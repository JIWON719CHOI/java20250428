package ch09.sec07.exam02;

public class HomeExample {
    public static void main(String[] args) {
        // Home Object
        Home home = new Home();

        // anonymous 구현 객체가 대입된 필드 사용
        home.use1();
        // anonymous 구현 객체가 대입된 local variable 사용
        home.use2();
        // anonymous 구현 객체가 대입된 매개변수 사용
        home.use3(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Heat ON");
            }

            @Override
            public void turnOff() {
                System.out.println("Heat OFF");
            }
        });
    }
}
