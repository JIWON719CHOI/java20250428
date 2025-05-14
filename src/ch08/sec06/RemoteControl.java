package ch08.sec06;

public interface RemoteControl {
    // 상수 필드
    int MAX_VOULUME = 10;
    int MIN_VOULUME = 0;

    // 추상 메소드
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    // default method
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("📺🔈");
            // 추상 메소드 호출하면서 상수 필드 사용
            setVolume((MIN_VOULUME));
        } else {
            System.out.println("📺🔊");
        }
    }

    // static method
    static void changeBattery() {
        System.out.println("🪫");
    }
}
