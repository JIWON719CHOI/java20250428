package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        // interface 변수 선언
        RemoteControl rc;

        // television 객체 생성, 인터페이스 변수에 대입
        // interface로 Television 객체 사용
        rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // Audio 객체를 생성, 인터페이스 변수에 대입
        // 인터페이스로 Audio 객체 사용
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();
    }
}
