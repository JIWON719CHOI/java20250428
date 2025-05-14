package ch08.sec04;

public class Audio implements RemoteControl {
    // field
    private int volume;

    // turnOn(), turnOff(), setVolume() 추상 메소드 오버라이딩

    @Override
    public void turnOn() {
        System.out.println("AUDIO ON!");
    }

    @Override
    public void turnOff() {
        System.out.println("AUDIO OFF!");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOULUME) {
            this.volume = RemoteControl.MAX_VOULUME;
        } else if (volume < RemoteControl.MIN_VOULUME) {
            this.volume = RemoteControl.MIN_VOULUME;
        } else {
            this.volume = volume;
        }
        System.out.println("🔈Now Audio: " + this.volume);
    }
}
