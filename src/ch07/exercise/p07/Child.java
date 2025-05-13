package ch07.exercise.p07;

public class Child extends Parent {
    public String name;

    public Child() {
        this("HONG");
        System.out.println("Child() call");
    }

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }
}
