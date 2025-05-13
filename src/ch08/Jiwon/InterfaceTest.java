package ch08.Jiwon;

// 인터페이스 정의
interface RemoteControl {
    // 상수 필드 (자동으로 public static final)
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드 (자동으로 public abstract)
    void turnOn();

    void turnOff();

    void setVolume(int volume);

    // 디폴트 메소드
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("음소거 처리합니다.");
        } else {
            System.out.println("음소거 해제합니다.");
        }
    }

    // 정적 메소드
    static void changeBattery() {
        System.out.println("리모컨 배터리를 교체합니다.");
    }

    // private 메소드 (인터페이스 내부용)
    private void log(String message) {
        System.out.println("LOG: " + message);
    }
}

// 두 번째 인터페이스: Search 기능 제공
interface Searchable {
    void search(String keyword);
}

// 인터페이스 상속: SmartRemote는 RemoteControl 확장
interface SmartRemote extends RemoteControl {
    void voiceControl(String command);
}

// 구현 클래스: Television
class Television implements SmartRemote, Searchable {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("TV 볼륨: " + this.volume);
    }

    @Override
    public void search(String keyword) {
        System.out.println("TV 에서 '" + keyword + "' 검색 중...");
    }

    @Override
    public void voiceControl(String command) {
        System.out.println("음성 명령: " + command);
    }
}

// 테스트 클래스
public class InterfaceTest {
    public static void main(String[] args) {
        // 인터페이스 타입으로 구현 객체 다루기 (다형성)
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(7);
        rc.setMute(true); // default 메소드 호출
        rc.turnOff();

        // 정적 메소드 호출 (인터페이스명.메소드)
        RemoteControl.changeBattery();

        // 다중 인터페이스 기능 사용
        Searchable s = new Television();
        s.search("자바 인터페이스");

        // 타입 확인 및 다운캐스팅
        if (rc instanceof Television) {
            Television tv = (Television) rc;
            tv.voiceControl("넷플릭스 켜줘");
        }
    }
}