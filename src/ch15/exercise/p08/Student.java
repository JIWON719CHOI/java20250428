package ch15.exercise.p08;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    // 코드 작성

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        Student student = (Student) object;
        return studentNum == student.studentNum;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}

