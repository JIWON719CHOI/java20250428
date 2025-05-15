package ch12.lecture.p01object;

import java.util.HashSet;

public class App05 {
    public static void main(String[] args) {
        Student05 a = new Student05(1, "son");
        Student05 b = new Student05(2, "son");
        Student05 c = new Student05(3, "kim");
        Student05 d = new Student05(1, "son");

        // HashSet : 여러 객체를 보관하는 객체, 하지만 같은 객체는 담지 않는다.
        HashSet set = new HashSet();
        set.add(a);
        set.add(b);
        set.add(c);
        set.add(d);
        System.out.println(set.size());

    }
}

class Student05 {
    private int classNumber;
    private String name;

    public Student05(int classNumber, String name) {
        this.classNumber = classNumber;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return classNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student05) {
            Student05 s = (Student05) obj;
            return this.name.equals(s.name);
        }
        return false;
    }
}