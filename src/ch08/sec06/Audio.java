package ch08.sec06;

public class Audio implements RemoteControl {
    // field
    private int volume;

    // turnOn(), turnOff(), setVolume() 추상 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("📻🔥");
    }

    @Override
    public void turnOff() {
        System.out.println("📻🕳️");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > ch08.sec04.RemoteControl.MAX_VOULUME) {
            this.volume = ch08.sec04.RemoteControl.MAX_VOULUME;
        } else if (volume < ch08.sec04.RemoteControl.MIN_VOULUME) {
            this.volume = ch08.sec04.RemoteControl.MIN_VOULUME;
        } else {
            this.volume = volume;
        }
        System.out.println("📻🔉: " + this.volume);
    }

    // field 추가 필드 선언
    private int memoryVolume;

    // default method 정의
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("📻🔈");
            setVolume((RemoteControl.MIN_VOULUME));
        } else {
            System.out.println("📻🔊");
            setVolume(this.memoryVolume); // mute가 원래 false 일 경우, 원래 볼륨으로 복원하는 코드
        }
    }
}
