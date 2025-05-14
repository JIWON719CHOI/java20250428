package ch09.exercise.p06;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        anony.field.run();
        anony.method1();
        anony.method2(() -> System.out.println("🛻💨") // 람다식 문법 16장에서 배울 것.

        );
    }
}
