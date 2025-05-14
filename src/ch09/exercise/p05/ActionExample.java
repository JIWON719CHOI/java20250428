package ch09.exercise.p05;

public class ActionExample {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("COPY");
            }
        };
        action.work();

    }
}
