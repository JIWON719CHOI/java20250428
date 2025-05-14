package ch09.sec07.exam02;

public class Home {
    // field 에 anonymous 구현 객체 대입
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("ON TV");
        }

        @Override
        public void turnOff() {
            System.out.println("OFF TV");
        }
    };

    // method (field 이용)
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    // method local variable
    public void use2() {
        // local variable에 익명 구현 객체 대입
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("AirConditional ON");
            }

            @Override
            public void turnOff() {
                System.out.println("AirConditional OFF");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    // method 매개 변수 이용
    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }

}
