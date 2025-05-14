package ch08.sec04;

public interface RemoteControl {
    // 상수 필드
    int MAX_VOULUME = 10;
    int MIN_VOULUME = 0;

    // 추상 메소드   메소드 선언부만 작성
    void turnOn();

    void turnOff();

    void setVolume(int volume);
}
