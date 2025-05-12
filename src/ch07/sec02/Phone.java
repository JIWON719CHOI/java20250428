package ch07.sec02;

public class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 메소드 선언
    public void bell() {
        System.out.println("🔔Ring!");
    }

    public void sendVoice(String message) {
        System.out.println("👤Me: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("👤You: " + message);
    }

    public void hangUp() {
        System.out.println("📵HangUp-");
    }
}
