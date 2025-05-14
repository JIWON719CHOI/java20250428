package ch09.exercise.p06;

public class Anonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("🚲💨");
        }
    };

    void method1() {
        Vehicle localVar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("🚗💨");
            }

        };
        localVar.run();
    }

    void method2(Vehicle v) {
        v.run();
    }
}
