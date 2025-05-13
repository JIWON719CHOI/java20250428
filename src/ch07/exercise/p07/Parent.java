package ch07.exercise.p07;

public class Parent {
    public String nation;

    public Parent() {
        this("KOREA");
        System.out.println("Parent() call");
    }

    public Parent(String nation) {
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
