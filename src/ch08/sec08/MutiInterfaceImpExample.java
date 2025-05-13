package ch08.sec08;

public class MutiInterfaceImpExample {
    public static void main(String[] args) {
        // RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
        RemoteControl rc = new SmartTelevision();
        // RemoteControl 인터페이스에 선언된 추상 메소드만 호출 가능
        rc.turnOn();
        rc.turnOff();
        // Searchable 인터페이스 변수 선언 및 구현 객체 대입
        Searchable serializable = new SmartTelevision();
        // Searchable 인터페이스에 선언된 추상 메소드만 호출 가능
        serializable.search("http://www.youtube.com");
    }
}
