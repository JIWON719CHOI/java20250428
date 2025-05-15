package ch12.exercise.p05;

public class Student {
    private String studentNum;

    public Student(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    // 여기에 정답
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return studentNum.equals(student.studentNum);
    }

    @Override
    public int hashCode() {
        return studentNum.hashCode();
    }
}
