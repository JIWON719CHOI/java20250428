package ch17.sec12.exam01;

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

        // Male Student List
//        List<Student> maleLIst = totalList.stream().filter(s -> s.getSex().equals("M")).collect(Collectors.toList());

        List<Student> maleList = totalList.stream().filter(s -> s.getSex().equals("M")).toList();

        maleList.forEach(s -> System.out.println(s.getName()));

        System.out.println();

        // 학생 이름을 키, 학생의 점수를 값으로 갖는 Map 생성
        Map<String, Integer> map = totalList.stream()
                .collect(
                        Collectors.toMap(
                                Student::getName,
                                Student::getScore
                        )
                );

        System.out.println(map);

    }
}
