package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("Galaxy", "Silver");

        // Phone 으로부터 상속받은 필드 읽기
        System.out.println("📱Model: " + myPhone.model);
        System.out.println("🎨Color: " + myPhone.color);

        // SmartPhone 의 필드 읽기
        System.out.println("🛜Wifi: " + myPhone.wifi);

        // Phone 으로부터 상속받은 메소드 호출
        myPhone.bell();
        myPhone.sendVoice("Hello🖐️");
        myPhone.receiveVoice("Hi~ My name is Hong!🫂");
        myPhone.sendVoice("Welcome, Hong~🩷");
        myPhone.hangUp();

        // SmartPhone의 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
