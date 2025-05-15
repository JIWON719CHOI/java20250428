package ch12.lecture.p01object;

public class App09 {
    public static void main(String[] args) {
        Car09 c1 = new Car09("Tesla", 7000);

        System.out.println(c1.toString());
    }
}

class Car09 {
    private String model;
    private int price;

    public Car09(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "car09{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
