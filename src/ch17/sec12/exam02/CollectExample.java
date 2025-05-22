package ch17.sec12.exam02;

import ch17.sec12.exam01.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> totalList = new ArrayList<>();
        totalList.add(new Student("HONG", "M", 92));
        totalList.add(new Student("KIM", "F", 87));
        totalList.add(new Student("GAM", "M", 95));
        totalList.add(new Student("OH", "F", 93));

        Map<String, List<Student>> map = totalList.stream().collect(Collectors.groupingBy(Student::getSex));

        List<Student> maleList = map.get("M");
        maleList.forEach(s -> System.out.println(s.getName()));
        System.out.println();

        List<Student> femaleList = map.get("F");
        femaleList.forEach(s -> System.out.println(s.getName()));
    }
}
