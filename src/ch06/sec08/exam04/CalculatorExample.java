
package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        double r1 = c.areaRectangle(10);

        double r2 = c.areaRectangle(10, 20);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
    }
}
