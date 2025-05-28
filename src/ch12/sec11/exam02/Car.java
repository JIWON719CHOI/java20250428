package ch12.sec11.exam02;

public class Car {
    // field
    private String model;
    private String owner;

    // Constructor

    public Car(String model, String owner) {
        this.model = model;
        this.owner = owner;
    }

    // Method

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
