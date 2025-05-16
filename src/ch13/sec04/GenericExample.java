package ch13.sec04;

public class GenericExample {
    public static <T extends Number> boolean compare(T t1, T t2) {

        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return v1 == v2;

    }

    public static void main(String[] args) {
        boolean r1 = compare(10, 20);
        System.out.println("r1 = " + r1);
        boolean r2 = compare(4.5, 4.5);
        System.out.println("r2 = " + r2);

    }
}