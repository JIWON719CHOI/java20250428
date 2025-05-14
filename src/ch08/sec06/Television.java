package ch08.sec06;

public class Television implements RemoteControl {
    // field
    private int volume;

    // turnOn(), turnOff(), setVolume() 추상 메소드 오버라이딩
    @Override
    public void turnOn() {
        System.out.println("📺🔥");
    }

    @Override
    public void turnOff() {
        System.out.println("📺🕳️");
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
        System.out.println("📺🔈: " + this.volume);
    }
}
