package ch17.sec11;

import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("hong", 92),
                new Student("shin", 95),
                new Student("java", 88)
        );

        // 학생들 점수 합계
        Integer r2 = list.stream()
                .map(Student::getScore)
                .reduce(0, Integer::sum);
        System.out.println("r2 = " + r2);

        int r1 = list.stream()
                .mapToInt(Student::getScore)
                .sum();

        System.out.println("r1 = " + r1);

    }
}