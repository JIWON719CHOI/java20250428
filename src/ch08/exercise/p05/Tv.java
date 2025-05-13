package ch08.exercise.p05;

public class Tv implements Remocon {
    @Override
    public void powerOn() {

    }

    public static void main(String[] args) {
        Remocon r = new Tv();
        r.powerOn();
    }


}
