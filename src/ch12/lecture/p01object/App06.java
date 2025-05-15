package ch12.lecture.p01object;

import java.util.Objects;

public class App06 {
    public static void main(String[] args) {
        Student06 a = new Student06(1, "son");
        Student06 b = new Student06(2, "son");
        Student06 c = new Student06(1, "kim");
        Student06 d = new Student06(1, "son");
        int ah = a.hashCode();

        System.out.println("ah = " + ah);
        System.out.println("b.hashCode() = " + b.hashCode());
        System.out.println("c.hashCode() = " + c.hashCode());
        System.out.println("d.hashCode() = " + d.hashCode());
    }
}

class Student06 {
    private int classNumber;
    private String name;

    public Student06(int classNumber, String name) {
        this.classNumber = classNumber;
        this.name = name;
    }
    // hashCode, equals 재정의

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student06 student06 = (Student06) o;
        return classNumber == student06.classNumber && Objects.equals(name, student06.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classNumber, name);
    }
}