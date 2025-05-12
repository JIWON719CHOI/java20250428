package ch07.sec02;

public class SmartPhone extends Phone {
    // 필드 선언
    public boolean wifi;

    // 생성자 선언
    public SmartPhone(String model, String color) { // Phone 으로 부터 상속 받은 메서드
        this.model = model;
        this.color = color;
    }

    // 메소드 선언
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("🛜SetWifi");
    }

    public void internet() {
        System.out.println("🌐connect Internet");
    }
}
