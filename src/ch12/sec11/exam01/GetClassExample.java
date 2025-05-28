package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) {
        // how1
        Class clazz = Car.class;

        // how2
//        Class clazz= Class.forName("ch12.sec11.exam01.Car");

        // how3
//        Car car = new Car();
//        Class clazz = car.getClass();

        System.out.println("Package: " + clazz.getPackage().getName());
        System.out.println("Class Simple Name: " + clazz.getSimpleName());
        System.out.println("Class Full Name: " + clazz.getName());
    }
}
